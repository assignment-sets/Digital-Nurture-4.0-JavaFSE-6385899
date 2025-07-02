package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");
        BookService bookService = (BookService) context.getBean("bookService");

        bookRepository.displayRepo();
        bookService.displayService();
    }
}
