package ru.skypro.employeebookwithcollectionver1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.employeebookwithcollectionver1.Service.EmployeeService;
import ru.skypro.employeebookwithcollectionver1.exception.DubleEmployee;
import ru.skypro.employeebookwithcollectionver1.exception.EmployeeNotFound;
import ru.skypro.employeebookwithcollectionver1.model.Employee;

import java.util.List;

@RestController

@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public String show() {
        return "тест";
    }



    @GetMapping("post")
    public String addEmployee(@RequestParam  String firstName, @RequestParam String secondName)  {

        boolean result = employeeService.addEmployee(firstName, secondName);
        if (result) {
            return  "сотрудник " + firstName + secondName + "добавлен! ";
        }
         throw new DubleEmployee();
    }

    @GetMapping("/remove")
    public String removeEmployee(@RequestParam String firstName, @RequestParam String secondName) {
        boolean result = employeeService.removeEmployee(firstName,secondName);
        if(result) {
            return "сотрудник " + firstName+ " " + secondName+" " + "удален";
        }
        throw new EmployeeNotFound();
    }

    @GetMapping("getAll")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

}


