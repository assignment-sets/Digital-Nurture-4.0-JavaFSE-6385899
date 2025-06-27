CREATE TABLE savings_accounts (
    acc_id NUMBER PRIMARY KEY,
    acc_holder VARCHAR2(50) NOT NULL,
    balance NUMBER(12,2) NOT NULL,
    acc_type VARCHAR2(20) DEFAULT 'SAVINGS' NOT NULL
);


INSERT ALL
  INTO savings_accounts (acc_id, acc_holder, balance) VALUES (1, 'Alice', 5000)
  INTO savings_accounts (acc_id, acc_holder, balance) VALUES (2, 'Bob', 10000)
  INTO savings_accounts (acc_id, acc_holder, balance) VALUES (3, 'Charlie', 7500)
  INTO savings_accounts (acc_id, acc_holder, balance) VALUES (4, 'Diana', 12000)
SELECT * FROM dual;


CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest(
    p_account_type IN VARCHAR2
)
AS
BEGIN
    UPDATE savings_accounts
    SET balance = balance + (balance * 0.01)
    WHERE acc_type = p_account_type;

    COMMIT;
END;
/



BEGIN
  ProcessMonthlyInterest('SAVINGS');
END;
/


SELECT * FROM savings_accounts;

----------------------------------------------------------


CREATE TABLE employees (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(50) NOT NULL,
    department VARCHAR2(30) NOT NULL,
    salary NUMBER(10,2) NOT NULL
);


INSERT ALL
  INTO employees (emp_id, emp_name, department, salary) VALUES (1, 'Malice', 'SALES', 50000)
  INTO employees (emp_id, emp_name, department, salary) VALUES (2, 'Bob', 'IT', 60000)
  INTO employees (emp_id, emp_name, department, salary) VALUES (3, 'Charlie', 'SALES', 55000)
  INTO employees (emp_id, emp_name, department, salary) VALUES (4, 'Diana', 'HR', 52000)
SELECT * FROM dual;



create or replace PROCEDURE UpdateEmployeeBonus(
    p_department in VARCHAR2,
    p_bonus_percentage in number
) as
BEGIN
    UPDATE employees set salary = salary + (salary*p_bonus_percentage/100)
    where department = p_department;

    COMMIT;
END;
/


BEGIN
    UpdateEmployeeBonus('SALES', 7.5);
END;
/

SELECT * FROM employees;


------------------------------------------------------


create or replace PROCEDURE TransferFunds(
    p_sender_acc_id in NUMBER,
    p_rec_acc_id in NUMBER,
    p_transfer_amt in number
) as
    v_balance number;
BEGIN
    select balance INTO v_balance
    from savings_accounts
    where acc_id = p_sender_acc_id
    for UPDATE;

    if v_balance < p_transfer_amt then
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds');
    else
        update savings_accounts set balance = balance - p_transfer_amt
        where acc_id = p_sender_acc_id;

        update savings_accounts set balance = balance + p_transfer_amt
        where acc_id = p_rec_acc_id;
        
        COMMIT;
    end if;
END;
/

BEGIN
  TransferFunds(1, 2, 1000);
END;
/