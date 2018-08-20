package com.xtronit.config;

import com.xtronit.entity.Employee;
import org.springframework.batch.item.ItemProcessor;

public class DBLogProcessor implements ItemProcessor<Employee, Employee> {

    public Employee process(Employee employee) throws Exception {
        System.out.println("Inserting employee : " + employee);
        return employee;
    }
}