package com.eluriomilmar.teste;

import com.eluriomilmar.services.PensionService;
import com.eluriomilmar.services.SalaryService;
import com.eluriomilmar.entities.Employee;
import com.eluriomilmar.services.TaxService;

import java.util.Scanner;

public class Program {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Salario bruto: ");
        double grossSalary = sc.nextDouble();

        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(taxService, pensionService);


        Employee employee = new Employee(name, grossSalary);


        double netSalary = salaryService.netSalary(employee);
        System.out.println("Salario líquido = " + netSalary);
    }
}
