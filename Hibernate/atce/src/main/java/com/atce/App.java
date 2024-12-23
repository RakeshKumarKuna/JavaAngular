package com.atce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	static {
		System.out.println("App.static_block)");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (Connection statement = DriverManager.getConnection("jdbc:mysql://localhost:3306/rakesh", "root", "root");
				Statement st = statement.createStatement()) {
			ResultSet rs = st.executeQuery("select * from animal");
			while (rs.next()) {

				System.out.println(rs.getInt(1) + " --" + rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
