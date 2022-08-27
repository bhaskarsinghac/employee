package employeemanagement.employee.controller;

import employeemanagement.employee.model.Employee;
import employeemanagement.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Employee_controller {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        repository.save(employee);
        return ("Employee Added with CODE: " + employee.getCode());

    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @GetMapping("/getById{code}")
    public Optional<Employee> getById(@PathVariable int code) {
       return repository.findById(code);


    }
}
