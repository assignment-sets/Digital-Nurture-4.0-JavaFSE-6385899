package com.cognizant.loan.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "account-service")
public interface AccountClient {
    @GetMapping("/accounts/{number}")
    Map<String, Object> getAccount(@PathVariable("number") String number);
}
