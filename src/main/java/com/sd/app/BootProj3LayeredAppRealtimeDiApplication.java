package com.sd.app;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sd.controller.PayRollController;
import com.sd.model.Employee;

@SpringBootApplication
public class BootProj3LayeredAppRealtimeDiApplication {

  public static void main(String[] args) {

    // read inputs from user
    Scanner sc = new Scanner(System.in);
    System.out.println("Employee Name : ");
    String employeeName = sc.next();
    System.out.println("Employee Designation : ");
    String employeeDesignation = sc.next();
    System.out.println("Employee Name : ");
    double basicSalary = sc.nextDouble();

    Employee employee = new Employee();
    employee.setEmployeeName(employeeName);
    employee.setEmployeeDesignation(employeeDesignation);
    employee.setSalary(basicSalary);
    //
    // IOC contatiner
    ApplicationContext ctx = SpringApplication.run(BootProj3LayeredAppRealtimeDiApplication.class, args);
    PayRollController controller = ctx.getBean("payRollController", PayRollController.class);
    try {
      boolean result = controller.processEmployee(employee);
      if (result) {
        System.out.println("=============================================");
        System.out.println(" Registration successful!");
        System.out.println("Employee Name:" + employee.getEmployeeName());
        System.out.println("Employee Designation :" + employee.getEmployeeDesignation());
        System.out.println("Emoloyee Salay :" + employee.getSalary());
        System.out.println("Employee Gross salary : " + employee.getGrossSalary());
        System.out.println("Employee net salary : " + employee.getNetSalary());
        System.out.println("=============================================");
      } else {
        System.out.println("Registration failed ! Internall error!");
      }
    } catch (SQLException se) {
      se.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("internal problem TryAgain" + e.getMessage());
    }

    sc.close();
    ((ConfigurableApplicationContext) ctx).close();
  }

}
