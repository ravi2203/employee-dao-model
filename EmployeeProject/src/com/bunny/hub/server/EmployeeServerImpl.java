package com.bunny.hub.server;

import com.bunny.hub.dao.EmployeeDAO;
import com.bunny.hub.dao.EmployeeDAOImpl;
import com.bunny.hub.model.Employee;

public class EmployeeServerImpl implements EmployeeServer {
	public EmployeeDAO dao=null;
	public EmployeeServerImpl()
	{
		dao=new EmployeeDAOImpl();
	}

	public int save(Employee e) {
	int status=0;
	status=dao.save(e);
	System.out.println("status at server is"+status);
		// TODO Auto-generated method stub
		return status;
	}

	public int update(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
