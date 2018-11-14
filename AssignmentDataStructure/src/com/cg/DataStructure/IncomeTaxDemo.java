package com.cg.DataStructure;
import java.util.Scanner;

public class IncomeTaxDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter the CTC:  ");
		Scanner sc = new Scanner(System.in);
		
		float ctc = sc.nextFloat();
		
		if(ctc>0 && ctc<180000)
		{
			System.out.println("You do not have to pay any tax");
		}
		else if(ctc>181001 && ctc<300000)
		{
			float tax=(float)0.1*ctc;
			System.out.println("Tax to be paid is : "+tax);
			
		}
		else if(ctc>300001 && ctc<500000)
		{
			float tax=(float)0.2*ctc;
			System.out.println("Tax to be paid is : "+tax);
			
		}
		else if(ctc>500001 && ctc<1000000)
		{
			float tax=(float)0.3*ctc;
			System.out.println("Tax to be paid is : "+tax);
			
		}
		else
		{
			System.out.println("Invalid CTC ");
		}

	}

}
