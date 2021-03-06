package com.example.demo.service;

import com.example.demo.model.EC;
import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeModel;
import com.example.demo.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;


    @Override
    public Optional<Employee> findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll() ;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Iterable<Employee> findByName(String name) {
        return employeeRepository.findEmployeesByNameContaining(name);
    }

    @Override
    public List<EmployeeModel> findEmployee(String name) {
        return employeeRepository.findEmployee(name);
    }
//    @Override
//    public List<EC> findEmployee2(String name) {
//        List<EmployeeModel> employeeModels =  employeeRepository.findEmployee(name);
//        EC ec = new EC();
//        for (EmployeeModel item: employeeModels) {
//            ec.setCompanyName(ec.getCompanyName()));
//        }
//         return  null;
//    }
}
