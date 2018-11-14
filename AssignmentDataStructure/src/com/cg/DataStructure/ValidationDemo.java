package com.cg.DataStructure;

import java.util.Scanner;

public class ValidationDemo {

	public static void main(String[] args) {

		String username = "ashna";
		String password = "sharma";

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the user name:  ");
			String login_name = sc.nextLine();

			System.out.println("Enter the password:  ");
			String psw = sc.nextLine();
			
			if(login_name.equals(username)) {
				if(psw.equals(password))
			
			{
				System.out.println("Welcome" + username);
				break;
			}else {
				System.out.println("try again");
			}
		}
		System.out.println("Contact Admin");

	}
	}
}
