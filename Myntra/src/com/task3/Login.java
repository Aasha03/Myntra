package com.task3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {
	public int loginDetails() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello!,Welcome to Myntra");
		System.out.println("Enter your loggin details here:");
		System.out.println("Enter your Email:");
		String Email = sc.next();
		System.out.println("Enter your Password:");
		String Password = sc.next();

		Connection connection = Jdbconnection.establishDatabaseConnection();

		String customerQuery = "Select * from user_details where email = ? and password = ?";

		PreparedStatement customerPreparedStatement = connection.prepareStatement(customerQuery);

		customerPreparedStatement.setString(1, Email);
		customerPreparedStatement.setString(2, Password);

		ResultSet customerResultSet = customerPreparedStatement.executeQuery();

		int flag = 0;

		while (customerResultSet.next()) {
			flag = 1;
			System.out.println("Hi!" + " " + customerResultSet.getString("first_name"));
		}

		return flag;

	}
}
