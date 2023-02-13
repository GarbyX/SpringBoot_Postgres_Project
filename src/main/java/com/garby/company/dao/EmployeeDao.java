package com.garby.company.dao;

import com.garby.company.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();
    void insertEmployee(Employee emp);
    void updateEmployee(Employee emp);
    void executeUpdateEmployee(Employee emp);
    public void deleteEmployee(Employee emp);
    // modifier public is redundant for interface methods.
}
