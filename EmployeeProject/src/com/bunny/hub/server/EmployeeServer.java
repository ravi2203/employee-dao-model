package com.bunny.hub.server;

import com.bunny.hub.model.Employee;

public interface EmployeeServer {
	public int save(Employee e);
	public int update(Employee e);
	public int delete(Employee e);
	public Employee get(int id);
	public Employee[] getAll();

}
