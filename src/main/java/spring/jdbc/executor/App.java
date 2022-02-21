package spring.jdbc.executor;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.jdbc.dao.EmployeeDaoImpl;
import spring.jdbc.dao.StudentDaoImpl;
import spring.jdbc.entity.Employee;
import spring.jdbc.entity.Student;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/jdbc/executor/config.xml");
//		StudentDaoImpl dao = context.getBean("dao",StudentDaoImpl.class);
		
//		inserting the student 
//		Student s1 = new Student();
//		s1.setId(1243);
//		s1.setName("neko");
//		s1.setCity("texas");
//		s1.setPhoneNumber("029343");
//		
//		int status1 = dao.insert(s1);
//		System.out.println(status1+" student inserted");
//		
//		updating studen
//		Student s2 = new Student();
//		s2.setId(12);
//		s2.setName("faiz");
//		s2.setCity("delhi");
//		s2.setPhoneNumber("12345");
//		
//		int status2 = dao.update(s2);
//		System.out.println(status2+" student updated");
//		
//		deleting student
//		int status3 = dao.delete(12);
//		System.out.println(status3+" student deleted");
//		
//		getting single student
//		Student student = dao.getStudent(11);
//		System.out.println(student.getId());
//		System.out.println(student.getName());
//		System.out.println(student.getCity());
//		System.out.println(student.getPhoneNumber());
//		
//		getting all students
//		List<Student> students = dao.getStudents();
//		students.forEach(s->System.out.println(s.getId()+" "+s.getName()+" "+s.getCity()+" "+s.getPhoneNumber()));
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		EmployeeDaoImpl dao = context.getBean("dao",EmployeeDaoImpl.class);
		
//		inserting employee
//		Employee e = new Employee();
//		e.setId(45);
//		e.setName("deadeye");
//		e.setCity("mexico");
//		int status1 = dao.insert(e);
//		System.out.println(status1+" employee inserted");
		
//		updating employee
//		Employee e2 = new Employee();
//		e2.setId(1531);
//		e2.setName("cipher");
//		e2.setCity("berlin");
//		int status2 = dao.update(e2);
//		System.out.println(status2+" employee updated");
		
//		deleting employee
//		int status3 = dao.delete(1561);
//		System.out.println(status3+" employee deleted");
		
//		getting employee
		Employee employee = dao.getEmployee(45);
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getCity());
		
//		getting all the employees
		List<Employee> employees = dao.getEmployees();
		for(Employee e:employees) {
			System.out.println(e.getId()+" "+e.getName()+" "+e.getCity());
		}
	}
}
