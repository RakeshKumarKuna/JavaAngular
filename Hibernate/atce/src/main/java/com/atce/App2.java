package com.atce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.sql.Types;

import com.mysql.cj.MysqlType;
import com.mysql.cj.jdbc.CallableStatement;

public class App2 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection statement = DriverManager.getConnection("jdbc:mysql://localhost:3306/rakesh", "root", "root");
			 java.sql.CallableStatement cs=statement.prepareCall("CALL AddTwoNumbers(?,?,?)");
			 cs.setInt(1, 2);
			 cs.setInt(2, 2);
			 cs.registerOutParameter(3,Types.INTEGER);
			 cs.execute();
			 int result=cs.getInt(3);
			 System.out.println(result);	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
