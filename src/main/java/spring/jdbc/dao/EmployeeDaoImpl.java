package spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import spring.jdbc.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

//	@Autowired
	public JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Employee employee) {
		String query = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getCity());
		return result;
	}

	public int update(Employee employee) {
		String query = "update employee set name=?,city=? where id=?";
		int result = jdbcTemplate.update(query,employee.getName(),employee.getCity(),employee.getId());
		return result;
	}

	public int delete(int id) {
		String query = "delete from employee where id=?";
		int result = jdbcTemplate.update(query,id);
		return result;
	}

	public Employee getEmployee(int id) {
		String query = "select * from employee where id=?";
		Employee employee = jdbcTemplate.queryForObject(query,new RowMapperImpl2(),id);
		return employee;
	}

	public List<Employee> getEmployees() {
		String query  = "select * from employee";
		List<Employee> employees = jdbcTemplate.query(query,new RowMapperImpl2());
		return employees;
	}
	
}
