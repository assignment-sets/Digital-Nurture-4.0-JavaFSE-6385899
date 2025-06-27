-- Schema

CREATE TABLE customers (
    cust_id NUMBER PRIMARY KEY,
    cust_name VARCHAR2(50) NOT NULL,
    age NUMBER(3) NOT NULL,
    vip NUMBER(1) DEFAULT 0 NOT NULL,
    balance NUMBER(12,2)
);

CREATE TABLE loans (
    loan_id NUMBER PRIMARY KEY,
    cust_id NUMBER NOT NULL,
    amt NUMBER(10,2) NOT NULL,
    rate NUMBER(4,2) NOT NULL,
    due_date DATE NOT NULL,
    CONSTRAINT fk_cust_id FOREIGN KEY (cust_id) REFERENCES customers(cust_id)
);

INSERT ALL
    INTO customers (cust_id, cust_name, age, vip, balance) VALUES (1, 'John Smith', 35, 1, 7500)
    INTO customers (cust_id, cust_name, age, vip, balance) VALUES (2, 'Emily Davis', 65, 0, 12000)
    INTO customers (cust_id, cust_name, age, vip, balance) VALUES (3, 'Michael Johnson', 45, 1, 12000)
    INTO customers (cust_id, cust_name, age, vip, balance) VALUES (4, 'Sophia Lee', 70, 0, 7500)
    INTO customers (cust_id, cust_name, age, vip, balance) VALUES (5, 'David Brown', 50, 1, 12000)
SELECT * FROM dual;

INSERT ALL
  INTO loans (loan_id, cust_id, amt, rate, due_date) VALUES (101, 1, 10000.00, 5.5, TO_DATE('2025-12-01', 'YYYY-MM-DD'))
  INTO loans (loan_id, cust_id, amt, rate, due_date) VALUES (102, 2, 5000.00, 6.2, TO_DATE('2025-10-15', 'YYYY-MM-DD'))
  INTO loans (loan_id, cust_id, amt, rate, due_date) VALUES (103, 3, 20000.00, 4.8, TO_DATE('2025-11-20', 'YYYY-MM-DD'))
  INTO loans (loan_id, cust_id, amt, rate, due_date) VALUES (104, 4, 3000.00, 7.0, TO_DATE('2025-07-05', 'YYYY-MM-DD'))
  INTO loans (loan_id, cust_id, amt, rate, due_date) VALUES (105, 5, 15000.00, 5.0, TO_DATE('2026-01-10', 'YYYY-MM-DD'))
SELECT * FROM dual;


---------------------------------------------------------------------


-- Scenario 1
BEGIN
  FOR c IN (SELECT cust_id FROM customers WHERE age > 60) LOOP
    UPDATE loans
    SET rate = rate - 1
    WHERE cust_id = c.cust_id;
  END LOOP;
  
  COMMIT;
END;
/

-- Scenario 2
BEGIN
  FOR c IN (
    SELECT cust_id
    FROM customers
    where balance > 10000
  ) LOOP
    UPDATE customers
    SET vip = 1
    WHERE cust_id = c.cust_id;
  END LOOP;
  
  COMMIT;
END;
/

-- Scenario 3
BEGIN
  FOR l IN (
    SELECT l.loan_id, l.due_date, c.cust_name
    FROM loans l
    JOIN customers c ON l.cust_id = c.cust_id
    WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan ' || l.loan_id || ' for customer ' || l.cust_name || 
      ' is due on ' || TO_CHAR(l.due_date, 'YYYY-MM-DD')
    );
  END LOOP;
END;
/
