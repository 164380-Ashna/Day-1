package com.cg.DataStructure;

public class ArmstrongDemo2 {

	public static void main(String[] args) {
		
		for (int num = 100; num < 1000; num++) {
			int digit=0;
			int sum = 0;
			int temp = num;
			while (temp > 0) {
				digit = temp % 10;
				temp = temp / 10;
				sum = sum + (digit * digit * digit);
			}

			if (num == sum) {
				System.out.println(num + " is the armstrong number");
			}
		}

	}

}
