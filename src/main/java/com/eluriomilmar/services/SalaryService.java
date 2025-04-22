package com.eluriomilmar.services;

import org.springframework.stereotype.Service;
import com.eluriomilmar.entities.Employee;
import com.eluriomilmar.services.SalaryService;
import com.eluriomilmar.services.TaxService;

@Service
public class SalaryService {

    private TaxService taxService;
    private PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee) {
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary());
    }
}
