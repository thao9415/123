package com.example.demo.service;

import com.example.demo.model.EC;
import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeModel;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    Optional<Employee> findById(int id);

    Iterable<Employee> findAll();

    Employee save(Employee employee);

    void delete(int id);

    Iterable<Employee> findByName(String name);

    List<EmployeeModel> findEmployee(String name);

//    public List<EC> findEmployee2(String name);
}
