package com.lulu.database.Systematic2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
	         Connection connection = DriverManager.getConnection("datapath",
	             "root", "");
	         Statement statement;
	         statement = connection.createStatement();
	         ResultSet resultSet;
	         resultSet = statement.executeQuery(
	             "select * from products");
	         int id;
	         String name;
	         String descp;
	         int cost;
	         while (resultSet.next()) {
	             id = resultSet.getInt("id");
	             name = resultSet.getString("name");
	             descp=resultSet.getString("descp");
	             cost = resultSet.getInt("cost");
	             System.out.println("id : " + id
	                                + " name : " + name + " description :"+ descp + "cost : " + cost);
	         }




			}catch(Exception E) {

			}

	}

}
