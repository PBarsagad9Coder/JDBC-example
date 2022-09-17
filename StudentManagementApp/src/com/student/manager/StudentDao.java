package com.student.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class StudentDao {

	public static boolean insertStudentIntoDb(Student st)
	{
		boolean f=false;	
		try {
			Connection con=Cp.createC();
			String q="insert into students(sname,sphone,scity)values(?,?,?)";
			//prepared Statement
			PreparedStatement ps=con.prepareStatement(q);
			//set the values
		    ps.setString(1,st.getSname());
		    ps.setString(2,st.getSphone());
		    ps.setString(3,st.getScity());
		    ps.executeUpdate();
		    f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int id) {
		boolean f=false;	
		try {
			Connection con=Cp.createC();
			String q="delete from students where sid=?";
			//prepared Statement
			PreparedStatement ps=con.prepareStatement(q);
			//set the values
		    ps.setInt(1,id);
		    ps.executeUpdate();
		    f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static void displayStudent() {
		
		try {
			Connection con=Cp.createC();
			String q="select * from students";
			//to read the content of database
			Statement statement= con.createStatement();
			ResultSet rs=statement.executeQuery(q);
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String phone=rs.getString(3);
				String city=rs.getString(4);
				System.out.println("Id: "+id);
				System.out.println("name: "+name);
				System.out.println("phone no: "+phone);
				System.out.println("City: "+city);
				System.out.println("..............................................");
			}
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean updateStudent(Student st) {
		boolean f=false;	
		try {
			Connection con=Cp.createC();
			String q="update students set sname=?,sphone=?,scity=? where sid=?";
			//prepared Statement
			PreparedStatement ps=con.prepareStatement(q);
			//set the values
			ps.setInt(4, st.getSid());
		    ps.setString(1,st.getSname());
		    ps.setString(2,st.getSphone());
		    ps.setString(3,st.getScity());
		    ps.executeUpdate();
		    f=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}
	
	
}
