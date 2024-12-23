package com.atce;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.MysqlType;

public class CallableSatement {	
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Connection statement = DriverManager.getConnection("jdbc:mysql://localhost:3306/rakesh", "root", "root");
			CallableStatement cs=statement.prepareCall("CALL AddTwoNumbers(?,?,?)");
			cs.setInt(1, 50);
			cs.setInt(2, 10);
			cs.execute();
			cs.registerOutParameter(3, MysqlType.INT);
			int result=cs.getInt(3);
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
