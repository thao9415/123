package com.example.demo.model;

import java.util.List;

public class EmployeeCreate {
    private String name;
    private double salary;
    private List<Integer> listCompanyId;

    public EmployeeCreate() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Integer> getListCompanyId() {
        return listCompanyId;
    }

    public void setListCompanyId(List<Integer> listCompanyId) {
        this.listCompanyId = listCompanyId;
    }
}
