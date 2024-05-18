package com.sd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.dao.IEmployeeDao;
import com.sd.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

  @Autowired
  private IEmployeeDao employeeDao;

  @Override
  public int registerEmployee(Employee employee) throws Exception {
    processEmployeeSalary(employee);
    int count = employeeDao.insert(employee);
    return count;
  }

  @Override
  public void processEmployeeSalary(Employee employee) throws Exception {
    System.out.println("processing Salary ....");
    double grossSalary = employee.getSalary() + (employee.getSalary() * 0.4f);
    double netSalary = grossSalary - (grossSalary * 0.2f);

    employee.setGrossSalary(grossSalary);
    employee.setNetSalary(netSalary);
  }

}
