package com.sd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sd.model.Employee;

/**
 * EmployeeDaoImpl
 */
@Repository("employeeDao")
public class EmployeeDaoImpl implements IEmployeeDao {

  private static final String INSERT_TO_EMPLOYEE = "INSERT INTO employee_info (ename,desg,salary,gross_salary,net_salary) VALUES(?,?,?,?,?)";

  @Autowired
  private DataSource ds;

  @Override
  public int insert(Employee employee) throws Exception {

    int count = 0;
    try (Connection con = ds.getConnection();
        PreparedStatement ps = con.prepareStatement(INSERT_TO_EMPLOYEE)) {

      ps.setString(1, employee.getEmployeeName());
      ps.setString(2, employee.getEmployeeDesignation());
      ps.setDouble(3, employee.getSalary());
      ps.setDouble(4, employee.getGrossSalary());
      ps.setDouble(5, employee.getNetSalary());

      count = ps.executeUpdate();

    } catch (SQLException se) {
      se.printStackTrace();
      throw se;
    } catch (Exception e) {
      e.printStackTrace();
      throw e;
    }
    return count;
  }

}
