package com.sd.dao;

import com.sd.model.Employee;

/**
 * IEmployeeDao interface
 */
public interface IEmployeeDao {

  public int insert(Employee employee) throws Exception;

}
