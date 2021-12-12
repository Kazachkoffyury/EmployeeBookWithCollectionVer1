package ru.skypro.employeebookwithcollectionver1.Service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.employeebookwithcollectionver1.Service.EmployeeService;
import ru.skypro.employeebookwithcollectionver1.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceimpl implements EmployeeService {
    List<Employee> employees;

public EmployeeServiceimpl() {
    employees = new ArrayList<>();
}
    @Override
    public boolean addEmployee(String firstName, String secondName) {
        Employee employee = new Employee(firstName,secondName);
        return employees.add(employee);

    }

    @Override
    public  boolean removeEmployee(String firstName, String secondName) {
        Employee employee = new Employee(firstName,secondName);
        return employees.remove(employee);

    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }


}

