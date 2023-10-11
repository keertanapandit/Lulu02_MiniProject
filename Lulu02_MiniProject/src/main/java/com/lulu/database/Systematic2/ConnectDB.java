package com.lulu.database.Systematic2;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
	static Connection connection;
	static Connection setupConnection() {

		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");//drive support sets up

	         connection = DriverManager.getConnection("datapath",
	            "root", "");
		}
		catch(Exception E) {

		}
		return connection;
	}

}
