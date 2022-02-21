package spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import spring.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao{
	
	public JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		String query = "insert into student values(?,?,?,?)";
		int result = jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity(),student.getPhoneNumber());
		return result;
	}

	public int update(Student student) {
		String query = "update student set name=?,city=?,phoneNumber=? where id=?";
		int result = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getPhoneNumber(),student.getId());
		return result;
	}

	public int delete(int id) {
		String query = "delete from student where id=?";
		int result = jdbcTemplate.update(query,id);
		return result;
	}

	public Student getStudent(int id) {
		String query = "select * from student where id=?";
		Student student = jdbcTemplate.queryForObject(query,new RowMapperImpl(),id);
		return student;
	}

	public List<Student> getStudents() {
		String query  = "select * from student";
		List<Student> students = jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	}

}
