package com.lulu.database.Systematic2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	static Connection connection;
	static Connection setupConnection() {

		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");//drive support sets up

	         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kp",
	            "root", "Mojojojo123???");
		}
		catch(Exception E) {

		}
		return connection;
	}

}
