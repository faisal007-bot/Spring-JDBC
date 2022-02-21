package spring.jdbc.dao;

import java.util.List;

import spring.jdbc.entity.Student;

public interface StudentDao {
	int insert(Student student);
	int update(Student student);
	int delete(int id);
	Student getStudent(int id);
	List<Student> getStudents();
}
