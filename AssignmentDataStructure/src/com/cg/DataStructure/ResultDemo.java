package com.cg.DataStructure;
import java.util.Scanner;

public class ResultDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter the marks of Physics:  ");
		Scanner sc = new Scanner(System.in);
		int marks1 = sc.nextInt();
		

		System.out.println("Enter the marks of Mathematics:  ");
		int marks2 = sc.nextInt();
		
		System.out.println("Enter the marks of English:  ");
		int marks3 = sc.nextInt();
		 
		float result= (float) (marks1+marks2+marks3)/3;
		
		if(marks1>60 && marks2>60 && marks3>60)
		{
			System.out.println("Passed");
		}
		else if((marks1>60 && marks2>60) || (marks2>60 && marks3>60) || (marks3>60 && marks1>60))
		{
			System.out.println("Promoted");
		}
		else if(result<60.0)
		{
			System.out.println("Failed");
		}
		else
		{
			System.out.println("Invalid response");
		}

	}

}
