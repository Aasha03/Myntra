package com.task3;

import java.sql.SQLException;

public class Myntra {
	public static void main(String[] args) throws SQLException {
		Login login = new Login();
		int flag = login.loginDetails();
		if (flag == 1) {
			System.out.println("You Logged in successfully");
		} else {
			System.out.println("User not found Signup here!");
			Signup signup = new Signup();
			int rows = signup.createAccount();
			if (rows >= 1) {
				System.out.println("Signedup Successfully");
			} else {
				System.out.println("Failed");
			}
		}

	}
}
