package org.jt.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.jt.employeemanagement.model.Employee;

public interface EmployeeService {
  /**
   * <h1>Save Employee into DB</h1>
   * <p>This method takes employee object as parameter and save it into DB</p>
   * 
   * @param org.jt.employeemanagement.model.Employee
   */
  void saveEmployee(Employee employee);
  List<Employee> getEmployees();
  void deleteEmployeeById(String id);
  Optional<Employee> getEmployeeById(String id);
}
