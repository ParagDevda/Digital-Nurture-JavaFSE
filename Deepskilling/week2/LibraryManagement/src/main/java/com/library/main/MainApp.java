package com.library.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;

public class MainApp {
	public static void main(String[] args) {
		
		ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
	    BookRepository br1 = (BookRepository) context.getBean("BR1");
	    br1.displayBooks();
	    
	    BookService bs1 = (BookService) context.getBean("BS1");
	    bs1.serviceMethod();
	    
	}
}
