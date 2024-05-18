package com.sd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sd.model.Employee;
import com.sd.service.IEmployeeService;

@Controller("payRollController")
public class PayRollController {

  @Autowired
  private IEmployeeService service;

  public boolean processEmployee(Employee employee) throws Exception {
    boolean message;
    int count = service.registerEmployee(employee);
    if (count != 0)
      message = true;
    else
      message = false;

    return message;

  }

}
