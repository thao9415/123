package com.example.demo.model;

import java.util.List;

public class EC {
    String nameEmployee;
    List<String> companyName;

    public EC() {
    }

    public EC(String nameEmployee, List<String> companyName) {
        this.nameEmployee = nameEmployee;
        this.companyName = companyName;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public List<String> getCompanyName() {
        return companyName;
    }

    public void setCompanyName(List<String> companyName) {
        this.companyName = companyName;
    }
}
