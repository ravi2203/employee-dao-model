package com.bunny.hub.dao;

import com.bunny.hub.model.Employee;

public interface EmployeeDAO {
	public int save(Employee e);
	public int update(Employee e);
	public int delete(Employee e);
	public Employee get(int id);
	public Employee[] getAll();

}
