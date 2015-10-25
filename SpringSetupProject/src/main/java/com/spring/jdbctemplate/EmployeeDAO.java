package com.spring.jdbctemplate;

import javax.sql.DataSource;

public interface EmployeeDAO {

	/**
	 * This is the method to be used to initialize database resources ie.
	 * connection.
	 */
	public void setDataSource(DataSource ds);

	/**
	 * This is the method to be used to list down a record from the Student
	 * table corresponding to a passed student id.
	 */
	public Employee getEmployee(Integer id);

}
