package com.example;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdatajpaDemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		employeeService.addEmployee(new Employee("Parag Devda", "Product Engineering"));
		employeeService.addEmployee(new Employee("Harshit", "HR"));

		employeeService.getAllEmployees().forEach(System.out::println);
	}
}
