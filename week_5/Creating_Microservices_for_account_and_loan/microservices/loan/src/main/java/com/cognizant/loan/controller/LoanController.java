package com.cognizant.loan.controller;

import com.cognizant.loan.feignClient.AccountClient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final AccountClient accountClient;

    public LoanController(AccountClient accountClient) {
        this.accountClient = accountClient;
    }

    @GetMapping("/{number}")
    public Map<String, Object> getLoan(@PathVariable String number) {
        Map<String, Object> loan = new HashMap<>();
        loan.put("number", number);
        loan.put("type", "car");
        loan.put("loan", 400000);
        loan.put("emi", 3258);
        loan.put("tenure", 18);

        Map<String, Object> account = accountClient.getAccount("00987987973432");
        loan.put("account", account);

        return loan;
    }

}
