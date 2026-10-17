package com.sarvesh.Employee_management_REST_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/employees")
    private Employee addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployee(){
        return service.getEmployee();
    }

    @PutMapping("/update-employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/delete-employee/{id}")
    public void deleteEmployee(@PathVariable int id){
        service.deleteEmployee(id);
    }
}
