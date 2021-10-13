package com.testing.Controller;

import com.testing.model.Employee;
import com.testing.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InputController {

  @Autowired
  private EmployeeRepository _employeeRepository;

  @PostMapping("/employees")
  public Employee newEmployee(@RequestBody Employee employee) {
    _employeeRepository.save(employee);
    return _employeeRepository.findById(employee.getId());
  }

  @GetMapping("employees/{id}")
  Employee employeeName(@PathVariable String id) {
    Employee data = _employeeRepository.findById(id);
    if( data == null) {
      return new Employee();
    } else {
      return data;
    }
  }

}