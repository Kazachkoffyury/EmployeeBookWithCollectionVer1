package ru.skypro.employeebookwithcollectionver1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.employeebookwithcollectionver1.Service.EmployeeService;
import ru.skypro.employeebookwithcollectionver1.model.Employee;

import java.util.List;

@RestController


public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public String show() {
        return "тест";
    }

    @GetMapping("/post")
    public boolean addEmployee(@RequestParam  String firstName, @RequestParam String secondName) {
        return  employeeService.addEmployee(firstName,secondName);
    }
    @GetMapping("/remove")
    public boolean removeEmployee(@RequestParam String firstName, @RequestParam String secondName) {
        return  employeeService.removeEmployee(firstName,secondName);
    }

    @GetMapping(path = "index")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

}


