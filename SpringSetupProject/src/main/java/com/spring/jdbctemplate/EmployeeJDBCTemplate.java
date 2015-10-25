package com.spring.jdbctemplate;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJDBCTemplate implements EmployeeDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);

	}

	@Override
	public Employee getEmployee(Integer id) {
		String SQL = "select * from Employees where employee_id = ?";
		Employee emp = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, new EmployeeMapper());
		return emp;
	}

}
