package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");//8.0
		    Class.forName("com.mysql.jdbc.Driver");//5.*版本
			String url = "jdbc:mysql://120.79.80.250:3306/demo";
			conn = DriverManager.getConnection(url,"demo","TFHCNZDbH2WRGTKj");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
