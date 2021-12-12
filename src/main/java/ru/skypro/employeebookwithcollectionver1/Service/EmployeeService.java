package ru.skypro.employeebookwithcollectionver1.Service;

import ru.skypro.employeebookwithcollectionver1.model.Employee;

import java.util.List;

public interface EmployeeService {
    boolean addEmployee(String firstName, String secondName);
    boolean  removeEmployee(String firstName,String secondName);
    List<Employee> getEmployees();
}

