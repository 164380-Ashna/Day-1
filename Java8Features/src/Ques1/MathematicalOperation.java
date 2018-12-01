package Ques1;

public class MathematicalOperation {

	@FunctionalInterface
	public interface SubOperations {

		void subtracting(int num1, int num2);

	}

	@FunctionalInterface
	public interface AddOperations {

		void adding(int num1, int num2);

	}

	@FunctionalInterface
	public interface MulOperations {

		void multiplying(int num1, int num2);

	}

	@FunctionalInterface
	public interface DivOperations {

		void dividing(int num1, int num2);

	}

	public static void main(String args[]) {

		AddOperations add = (num1, num2) -> {
			System.out.println( num1 + num2);
			
		};
		add.adding(20, 10);
		SubOperations sub = (num1, num2) -> {
			System.out.println( num1 - num2);
		};
		sub.subtracting(20, 10);
		MulOperations mul = (num1, num2) -> {
			System.out.println( num1 * num2);
		};
		mul.multiplying(20, 100);
		DivOperations div = (num1, num2) -> {
			System.out.println( num1 / num2);
		};
		div.dividing(20, 10);

	}

}
