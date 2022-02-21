package spring.jdbc.executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import spring.jdbc.dao.EmployeeDaoImpl;

@Configuration
public class JavaConfig {
	
	@Bean({"ds"})
	public DriverManagerDataSource getDriverManagerDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/record");
		ds.setUsername("root");
		ds.setPassword("faisal");
		return ds;
	}
	
	@Bean({"template"})
	public JdbcTemplate getTeJdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDriverManagerDataSource());
		return template;
	}
	
	@Bean({"dao"})
	public EmployeeDaoImpl getEmployeeDaoImpl() {
		EmployeeDaoImpl dao = new EmployeeDaoImpl();
//		we can also use autowired to inject the dependent object automatically
//		dao.setJdbcTemplate(getTeJdbcTemplate());
		return dao;
	}
}
