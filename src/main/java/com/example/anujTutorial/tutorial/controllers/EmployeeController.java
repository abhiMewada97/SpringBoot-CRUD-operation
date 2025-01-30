package com.example.anujTutorial.tutorial.controllers;

import com.example.anujTutorial.tutorial.dto.EmployeeDTO;
import com.example.anujTutorial.tutorial.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

//    @PostMapping(path = "/employees/{id}")
    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long EmployeeId) {
        return employeeService.getEmployeeById(EmployeeId);
    }

//    @PostMapping(path = "/employees")
    @PostMapping
    public EmployeeDTO getData(@RequestBody EmployeeDTO employeeDTO) {     //http://localhost:8081/employees?sortBy=abhi&limit=10
        return employeeService.createNewEmployee(employeeDTO);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteEmployeeById(@PathVariable Long id) {
        return employeeService.deleteEmployeeById(id);
    }
}
