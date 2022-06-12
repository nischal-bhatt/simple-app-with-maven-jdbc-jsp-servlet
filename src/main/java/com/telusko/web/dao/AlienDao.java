package com.telusko.web.dao;

import java.sql.*;

import com.telusko.web.model.Alien;

public class AlienDao {

	public Alien getAlien(int aid)
	{
		Alien a = new Alien();
		a.setAid(101);
		a.setAname("nav");
		a.setTech("hav");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neon","root","root");
		    Statement st = con.createStatement();
		   ResultSet rs =  st.executeQuery("select * from alien where aid=" + aid);
		   if (rs.next())
		   {
			   a.setAid(rs.getInt("aid"));
			   a.setAname(rs.getString("aname"));
			   a.setTech(rs.getString("tech"));
		   }
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("something happened");
		}
		
		return a;
	}
}
