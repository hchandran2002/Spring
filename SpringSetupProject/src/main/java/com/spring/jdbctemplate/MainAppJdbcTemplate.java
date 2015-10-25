package com.spring.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppJdbcTemplate {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("BeansDataSourceJdbc.xml");

		EmployeeJDBCTemplate employeeJDBCTemplate = (EmployeeJDBCTemplate) context.getBean("employeeJDBCTemplate");


		System.out.println("----Listing Record with ID = 2 -----");
		Employee emp = employeeJDBCTemplate.getEmployee(101);
		System.out.print("Emp ID : " + emp.getEmployeeId());
		System.out.print(", First Name : " + emp.getFirstName());
		System.out.print(", Last Name : " + emp.getLastName());
		System.out.println(", Email : " + emp.getEmail());

	}

}
