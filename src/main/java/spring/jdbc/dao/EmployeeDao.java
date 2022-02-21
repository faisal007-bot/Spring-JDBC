package spring.jdbc.dao;

import java.util.List;

import spring.jdbc.entity.Employee;

public interface EmployeeDao {
	int insert(Employee employee);
	int update(Employee employee);
	int delete(int id);
	Employee getEmployee(int id);
	List<Employee> getEmployees();
}
