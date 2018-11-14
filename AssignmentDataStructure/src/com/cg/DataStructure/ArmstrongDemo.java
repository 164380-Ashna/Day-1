package com.cg.DataStructure;
import java.util.Scanner; 

public class ArmstrongDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter the number:  ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); 
		System.out.println("The number is "+num);
		int digit;
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			digit=num%10;
			num=num/10;
			sum=sum+(digit*digit*digit);	
		}
		
		if(temp==sum)
			System.out.println("This is the armstrong number");
		else
			System.out.println("This is not an armstrong number");
		
	}

}
