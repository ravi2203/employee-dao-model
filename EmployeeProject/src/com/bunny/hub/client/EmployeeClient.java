package com.bunny.hub.client;

import java.util.Scanner;

import com.bunny.hub.model.Employee;
import com.bunny.hub.server.EmployeeServer;
import com.bunny.hub.server.EmployeeServerImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeServer ser=null;
				ser=new EmployeeServerImpl();
		Scanner scan=new Scanner(System.in);
		Employee emp=new Employee();
		System.out.println("enter the name");
		emp.setEmpName(scan.next());
		System.out.println("emter the id");
		emp.setEmpID(scan.nextInt());
		System.out.println("enter the salary");
		emp.setEmpSal(scan.nextDouble());
		int status =ser.save(emp);
		System.out.println(status+"record is inserted");
		System.out.println("git repoditory created");
	}

}
