package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.EmployeeService;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;


@SpringBootApplication
public class OrmLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static EmployeeService employeeService;
    private static SessionFactory factory;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        LOGGER.info("Inside main");

        employeeService = context.getBean(EmployeeService.class);

        // initialize SessionFactory for Hibernate
//        try {
//            factory = new Configuration()
//                    .configure("hibernate.cfg.xml")
//                    .addAnnotatedClass(Employee.class)
//                    .buildSessionFactory();
//        } catch (Throwable ex) {
//            System.err.println("Failed to create SessionFactory: " + ex);
//            throw new ExceptionInInitializerError(ex);
//        }

        // using jpa to add employee
        employeeService.addEmployeeJPA(new Employee("testEmp1", new BigDecimal("10000.00"), "dept1"));
        LOGGER.info("Added employee with id (JPA)");

        // using plain Hibernate to add employee
//        Integer empId = addEmployeeHibernate(new Employee("testEmp2", new BigDecimal("50000.00"), "dept2"));
//        LOGGER.info("Added employee with id (hibernate): {}", empId);

    }

    public static Integer addEmployeeHibernate(Employee employee) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }

}
