package com.lulu.database.Systematic2;

import java.sql.SQLException;

public class ContollerTester {
		public static void main(String[] args) throws SQLException {
			// TODO Auto-generated method stub
			BusinessLogic bl = new BusinessLogic();
			bl.createData();
			bl.readData();
			bl.updateData();
			bl.deleteData();

		}

	}



