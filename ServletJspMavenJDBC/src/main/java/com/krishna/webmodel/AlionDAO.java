package com.krishna.webmodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.annotation.WebServlet;


public class AlionDAO {
	public Alien getAlien(int aid) throws ClassNotFoundException, SQLException {
		Alien a=new Alien();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","KrishnaMySQL@5317");
		Statement statement = connection.createStatement();
		String sql="select *  from alien where aid="+aid;
	ResultSet rs = statement.executeQuery(sql);
	if(rs.next()) {
	
		a.setAid(rs.getInt("aid"));
		a.setAname(rs.getString("aname"));
		a.setTech(rs.getString("tech"));
		
	}
	return a;

}
}
