package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.company.newhrsystem.SalaryProcessor;
import com.kodilla.patterns2.adapter.company.oldhrsystem.TotalSalary;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements TotalSalary {
    @Override
    public double totalSalary(String[][] workers, double[] salaries) {
        return 0;
    }
//    @Override
//    public double totalSalary(String[][] workers, double[] salaries){
//        List<Employee> employeeList = new ArrayList<>();
//        for(int n=0; n<salaries.length; n++ ){
//            employeeList.add(new Employee(
//                    workers[n][0],
//                    workers[n][1],
//                    workers[n][2],
//                    new BigDecimal(salaries[n])));
//
//        }
//        return calculateSalaries(employeeList).doubleValue();
//    }
}
