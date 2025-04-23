package com.eluriomilmar.teste;

import com.eluriomilmar.entities.Employee;
import com.eluriomilmar.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.eluriomilmar"})
public class TesteApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;

	public static void main(String[] args) {
		SpringApplication.run(TesteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria", 4000);
		System.out.println(salaryService.netSalary(employee));

	}
}
