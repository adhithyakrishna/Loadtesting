package com.testing.repository;

import com.testing.model.Employee;

public interface EmployeeRepository {
    void save(Employee employee);
    Employee findById(String id);
}
