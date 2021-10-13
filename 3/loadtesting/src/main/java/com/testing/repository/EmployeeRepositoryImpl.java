package com.testing.repository;

import com.testing.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

  @Autowired
  private RedisTemplate<String, Employee> redisTemplate;


  @Override
  public void save(Employee employee) {
    redisTemplate.opsForValue().set(employee.getId(), employee);
  }

  @Override
  public Employee findById(String id) {
    return redisTemplate.opsForValue().get(id);
  }
}
