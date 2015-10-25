package com.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.DataDao;
import com.spring.domain.Employee;

public class DataServiceImpl implements DataService {
	
	@Autowired
	DataDao dataDao;


	public int insertRow(Employee employee) {
		employee.setEmployee_id(449);
		return dataDao.insertRow(employee);
	}


	public List<Employee> getList() {
		return dataDao.getList();
	}


	public Employee getRowById(int id) {
		return dataDao.getRowById(id);
	}


	public int updateRow(Employee employee) {
		return dataDao.updateRow(employee);
	}


	public int deleteRow(int id) {
		return dataDao.deleteRow(id);
	}

}
