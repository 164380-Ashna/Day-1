package Ques2;

import java.util.Scanner;

@FunctionalInterface
interface CheckCriteria1 {

	boolean check1(double price);

}

@FunctionalInterface
interface CheckCriteria2 {

	boolean check2(String status);

}

@FunctionalInterface
interface CheckCriteriatogether {

	void checkfinal();

}

public class Orders {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order Price:  ");

		double price = sc.nextDouble();

		System.out.println("Enter the order status");
		String status = sc.next();

		CheckCriteria1 ordercheck1 = (price1) -> {

			if (price1 > 10000)
				return true;
			else
				return false;
		};

		ordercheck1.check1(price);

		CheckCriteria2 ordercheck2 = (status1) -> {

			//
			// String status = String.valueOf(status1);
			if (status1.equals("ACCEPTED") || status1.equals("COMPLETED"))
				return true;
			else
				return false;
		};

		ordercheck2.check2(status);

		CheckCriteriatogether orderFinalCheck = () -> {

			System.out.println(ordercheck1.check1(price));
			System.out.println(ordercheck2.check2(status));
			if (ordercheck1.check1(price) && ordercheck2.check2(status))
				System.out.println("the order is valid");
			else
				System.out.println("The order is not valid");
		};
		orderFinalCheck.checkfinal();

	}

}
