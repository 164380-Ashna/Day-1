package com.cg.DataStructure;
import java.util.Scanner; 

public class InterestDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter the Principle:  ");
		Scanner sc = new Scanner(System.in);
		int principle = sc.nextInt(); 
		
		System.out.println("Enter the Rate of Interest:  ");
		float rate = sc.nextFloat(); 
		
		System.out.println("Enter the time period:  ");
		int time = sc.nextInt(); 
		
		float SimpleInterest=(principle*rate*time);
		System.out.println("The Simple interest is " +SimpleInterest);
		
		int CompoundInterest=(int)((principle*((1+( rate/ time ))^ time )- principle);
		System.out.println("The Compound interest is " +CompoundInterest);
		
		

	}

}
