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

}
