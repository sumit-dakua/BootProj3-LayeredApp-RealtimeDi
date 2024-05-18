package com.sd.model;

import lombok.Data;

/**
 * Employee
 */
@Data
public class Employee {

  private Integer employeeNumber;
  private String employeeName;
  private String employeeDesignation;
  private Double salary;
  private Double grossSalary;
  private Double netSalary;

  public Integer getEmployeeNumber() {
    return employeeNumber;
  }

  public void setEmployeeNumber(Integer employeeNumber) {
    this.employeeNumber = employeeNumber;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getEmployeeDesignation() {
    return employeeDesignation;
  }

  public void setEmployeeDesignation(String employeeDesignation) {
    this.employeeDesignation = employeeDesignation;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Double getGrossSalary() {
    return grossSalary;
  }

  public void setGrossSalary(Double grossSalary) {
    this.grossSalary = grossSalary;
  }

  public Double getNetSalary() {
    return netSalary;
  }

  public void setNetSalary(Double netSalary) {
    this.netSalary = netSalary;
  }

}
