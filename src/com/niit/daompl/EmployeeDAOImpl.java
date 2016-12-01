package com.niit.daompl;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.niit.dao.EmployeeDAO;
import com.niit.entity.Employee;
import com.niit.util.DBUtil;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static EmployeeDAO employeeDAO=null;
	
	 Connection con = null;
	
	private EmployeeDAOImpl()
	{
		
		con= DBUtil.getConnection();
		
		}
	
	public static EmployeeDAO getEmployeeDAO() {
		if(employeeDAO==null)
		{
			employeeDAO= new EmployeeDAOImpl();
			
		}
		
		
		return employeeDAO;
	}

	
	
	
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
		@Override
	public List<Employee> list() {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<Employee> employees= new ArrayList();		
		
		String selectSQL = "SELECT * FROM EMPLOYEE";
		Employee employee=null;
		// fetch the code 
		try(Statement stmt = con.createStatement())
		
		
		{
			ResultSet rs = stmt.executeQuery(selectSQL);
			
			while(rs.next())
			{
				
				employee = new Employee();
				
				employee.setId(rs.getInt("id"));
				employee.setFirstName(rs.getString("first_Name"));
				employee.setLastName(rs.getString("last_Name"));
				employee.setSalary(rs.getDouble("salary"));
				employee.setWorking(rs.getBoolean("working"));
				employees.add(employee);
				}
			
			
			
		} catch (SQLException e) {
			System.out.println("SQL ERROR"+ e.getMessage());
		}
		
	
		return employees;
		
}
	
	
	
	
	public boolean add(Employee employee) {
		
		String insertSQL ="(INSERT INTO employee)"
							+"(first_name, last_name,salary,working)VALUES"
										+"(?,?,?,?)";
		
		try(PreparedStatement pstmt=con.prepareStatement(insertSQL)
				)
		{
			pstmt.setString(1, employee.getFirstName());
			pstmt.setString(2, employee.getLastName());
			pstmt.setDouble(3, employee.getSalary());
			pstmt.setBoolean(4, employee.isWorking());
			pstmt.execute();
			return true;
		}
		catch(SQLException e)
		{
			System.out.println("SQL error"+ e.getMessage());
			
			return false;
		}
		
						
		
	}
@Override
	public boolean update(Employee employee) {
	// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}


}
