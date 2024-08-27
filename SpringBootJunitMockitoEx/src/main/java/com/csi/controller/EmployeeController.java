package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employess")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeServiceImpl.save(employee));
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Employee>> findAll() {
        return ResponseEntity.ok(employeeServiceImpl.findAll());
    }

    @PutMapping("/update/{empId}")

    public ResponseEntity<Employee> update(@PathVariable int empId, @RequestBody Employee employee) {
        //Exception Code
        return ResponseEntity.ok(employeeServiceImpl.update(employee));
    }

    @DeleteMapping("/deletebyid")

    public ResponseEntity<String> deleteById(@RequestParam int empId) {
        employeeServiceImpl.deleteById(empId);
        return ResponseEntity.ok("Data Deleted Successfully");
    }

}
