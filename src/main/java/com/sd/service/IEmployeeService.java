package com.sd.service;

import com.sd.model.Employee;

/**
 * IEmployeeService
 */
public interface IEmployeeService {

  public int registerEmployee(Employee employee) throws Exception;

  public void processEmployeeSalary(Employee employee) throws Exception;

}
