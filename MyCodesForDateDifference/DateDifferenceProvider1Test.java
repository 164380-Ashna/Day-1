package MyCodesForDateDifference;

import static org.junit.Assert.*;

import org.junit.Test;
import MyCodesForDateDifference.MyDate;

public class DateDifferenceProvider1Test {
	DateDifferenceProvider1 datediff = new DateDifferenceProvider1();

	@Test
	public void test1() {

		assertEquals(0, datediff.calculateDifference(new MyDate(06, 04, 2011),
				new MyDate(06, 04, 2011)), 0);
		System.out.println("Test Case Passed 1");
	}

	@Test
	public void test2() {
		assertEquals(12, datediff.calculateDifference(new MyDate(06, 04, 2011),
				new MyDate(18, 04, 2011)), 0);
		System.out.println("Test Case Passed 2");
	}

	@Test
	public void test3() {

		assertEquals(42, datediff.calculateDifference(new MyDate(06, 04, 2011),
				new MyDate(18, 05, 2011)), 0);
		System.out.println("Test Case Passed 3");
	}

	@Test
	public void test4() {
		assertEquals(73, datediff.calculateDifference(new MyDate(06, 04, 2011),
				new MyDate(18, 06, 2011)), 0);
		System.out.println("Test Case Passed 4");
	}

	@Test
	public void test5() {

		assertEquals(256, datediff.calculateDifference(
				new MyDate(06, 04, 2011), new MyDate(18, 12, 2011)), 0);
		System.out.println("Test Case Passed 5");
	}

	@Test
	public void test6() {

		assertEquals(622, datediff.calculateDifference(
				new MyDate(06, 04, 2011), new MyDate(18, 12, 2012)), 0);
		System.out.println("Test Case Passed 6");
	}

	@Test
	public void test7() {

		assertEquals(987, datediff.calculateDifference(
				new MyDate(06, 04, 2011), new MyDate(18, 12, 2013)), 0);
		System.out.println("Test Case Passed 7");
	}

	@Test
	public void test8() {

		assertEquals(37511, datediff.calculateDifference(new MyDate(06, 04,
				2011), new MyDate(18, 12, 2113)), 0);
		System.out.println("Test Case Passed 8");
	}

	@Test
	public void test9() {
		assertEquals(147084, datediff.calculateDifference(new MyDate(06, 04,
				2011), new MyDate(18, 12, 2413)), 0);
		System.out.println("Test Case Passed 9");
	}

	@Test
	public void test10() {

		assertEquals(293181, datediff.calculateDifference(new MyDate(06, 04,
				2011), new MyDate(18, 12, 2813)), 0);
		System.out.println("Test Case Passed 10");
	}

	@Test
	public void test111() {

		assertEquals(59, datediff.calculateDifference(new MyDate(06, 01, 2011),
				new MyDate(06, 03, 2011)), 0);
		System.out.println("Test Case Passed 11");
	}

	@Test
	public void test12() {

		assertEquals(60, datediff.calculateDifference(new MyDate(06, 01, 2012),
				new MyDate(06, 03, 2012)), 0);
		System.out.println("Test Case Passed 12");
	}

	@Test
	public void test13() {

		assertEquals(29, datediff.calculateDifference(new MyDate(06, 02, 2012),
				new MyDate(06, 03, 2012)), 0);
		System.out.println("Test Case Passed 13");
	}

	@Test
	public void test14() {
		assertEquals(298, datediff.calculateDifference(
				new MyDate(22, 01, 2012), new MyDate(15, 11, 2012)), 0);
		System.out.println("Test Case Passed 14");
	}

	@Test
	public void test15() {
		assertEquals(304, datediff.calculateDifference(
				new MyDate(06, 02, 2012), new MyDate(06, 12, 2012)), 0);
		System.out.println("Test Case Passed 15");
	}

}
