package com.bunny.hub.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;



import com.bunny.hub.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private Connection con=null;
	private PreparedStatement stmt=null;
	//private ResultSet rs=null;
	public static final String driver="oracle.jdbc.diver.OracleDriver";
	public static final String url="jdbc:oracle:thin:@localhost:1521:XE";
	public static final String user="system";
	public static final String pass="bunny";
	
	
	

	public int save(Employee e) {
		int status=0;
		
			try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, pass);
			String sql="insert into employee values(?,?,?)";
			stmt=con.prepareStatement(sql);
			stmt.setString(1,e.getEmpName());
			stmt.setInt(2, e.getEmpID());
			stmt.setDouble(3, e.getEmpSal());
			status=stmt.executeUpdate();
			System.out.println("staus at dao "+status);
			stmt.close();
			con.close();
			}
			catch(Exception e1)
			{
				
			}
		
		
			
	
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
