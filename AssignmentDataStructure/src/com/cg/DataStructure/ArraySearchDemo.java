package com.cg.DataStructure;


import java.util.Scanner;

public class ArraySearchDemo {

	public static void main(String[] args) {
		
		int[] arr= new int[]{5,12,14,6,78,19,1,23,16,35,37,7,52,86,47};
		int i;
		
		System.out.println("Enter the number:  ");
		Scanner sc = new Scanner(System.in);
		int key=sc.nextInt();;
		for(i=0;i<15;i++)
		{
			if(arr[i]==key) {
				System.out.println("The element is found");
				break;
			}
			
			
			
		}
		if(i==15)
			System.out.println("Not found");
		

	}

}
