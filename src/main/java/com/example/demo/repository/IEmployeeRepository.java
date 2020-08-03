package com.example.demo.repository;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    Iterable<Employee> findEmployeesByNameContaining(String employee_name);

    @Query(value = "select  new EmployeeModel (e.name, e.salary, c.name) from Employee e" +
            " left join Company c" +
            " on e.companyId = c.id" +
            " where e.name like :employeeName")
    List<EmployeeModel> findEmployee(@Param("employeeName") String employeeName);
}
