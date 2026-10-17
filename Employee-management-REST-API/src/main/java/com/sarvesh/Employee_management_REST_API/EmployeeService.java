package com.sarvesh.Employee_management_REST_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    public List<Employee> getEmployee() {
        return repo.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = repo.findById(employee.getId())
                        .orElseThrow(()-> new RuntimeException(
                                "employee not found with id" + employee.getId()));
        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setDept(employee.getDept());
        existingEmployee.setSalary(employee.getSalary());
        return repo.save(existingEmployee);
    }

    public void deleteEmployee(Integer id) {
        repo.deleteById(id);
    }
}
