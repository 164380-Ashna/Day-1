package MyCodesForDateDifference;

import MyCodesForDateDifference.MyDate;

public class DateDifferenceProvider1 {

	static final int JAN = 31;
	static final int FEB = 28;
	static final int MAR = 31;
	static final int APR = 30;
	static final int MAY = 31;
	static final int JUN = 30;
	static final int JUL = 31;
	static final int AUG = 31;
	static final int SEP = 30;
	static final int OCT = 31;
	static final int NOV = 30;
	static final int DEC = 31;

	int[] months = { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC };

	public int calculateDifference(MyDate startDate, MyDate endDate) {
		// TODO Auto-generated method stub

		if (sameDate(startDate, endDate) && sameMonth(startDate, endDate)
				&& sameYear(startDate, endDate)) {
			return 0;
		} else if (sameMonth(startDate, endDate)
				&& sameYear(startDate, endDate)) {
			int totalDays = endDate.getDd() - startDate.getDd();
			return totalDays;
		} else if (sameYear(startDate, endDate)) {
			int totalDays = remainingDays(startDate) + initialDays(endDate)
					+ DaysofMonthsinBetween(startDate, endDate);
			if (isLeapYear(startDate, endDate)) {
				int totalDaysLeap = 1 + remainingDays(startDate)
						+ initialDays(endDate)
						+ DaysofMonthsinBetween(startDate, endDate);
				return totalDaysLeap;
			} else {
				return totalDays;
			}
		} else if (isLeapYear(startDate, endDate)) {

			int count = leapYear(startDate, endDate);

			int totalDays = remainingDays(startDate)
					+ DaysofMonthsforDifferentYear(startDate, endDate)
					+ initialDays(endDate) + count;
			return totalDays;
		} else {
			int totalDays = remainingDays(startDate)
					+ DaysofMonthsforDifferentYear(startDate, endDate)
					+ initialDays(endDate);
			return totalDays;
		}
	}

	/*
	 * public static int calculateDifference(MyDate startDate, MyDate endDate){
	 * 
	 * int dateDifference=endDate.getDd()-startDate.getDd(); int
	 * monthDifference=endDate.getMm()-startDate.getMm(); int
	 * yearDifference=endDate.getYyyy()-startDate.getYyyy(); return 0 ;
	 * 
	 * 
	 * }
	 */

	private boolean sameDate(MyDate startDate, MyDate endDate) {
		return endDate.getDd() == startDate.getDd();

	}

	private boolean sameMonth(MyDate startDate, MyDate endDate) {
		return endDate.getMm() == startDate.getMm();

	}

	private boolean sameYear(MyDate startDate, MyDate endDate) {
		return endDate.getYyyy() == startDate.getYyyy();

	}

	private boolean isLeapYear(MyDate startDate, MyDate endDate) {

		int count = 0;
		for (int index = startDate.getYyyy(); index <= endDate.getYyyy(); index++) {
			if (index % 400 == 0) {
				count++;
			} else if (index % 100 == 0) {
				count = count;
			} else if (index % 4 == 0) {
				count++;
			} else {
				count = count;
			}

		}
		if (count != 0) {
			return true;
		} else
			return false;
	}

	private int leapYear(MyDate startDate, MyDate endDate) {
		int count = 0;
		for (int index = startDate.getYyyy(); index <= endDate.getYyyy(); index++) {
			if (index % 400 == 0) {
				count++;
			} else if (index % 100 == 0) {
				count = count;
			} else if (index % 4 == 0) {
				count++;
			} else {
				count = count;
			}

		}
		return count;

	}

	public int remainingDays(MyDate startDate) {

		int currentmonth = startDate.getMm();
		int remainingDays = months[currentmonth - 1] - startDate.getDd();
		return remainingDays;
	}

	public int initialDays(MyDate endDate) {

		return endDate.getDd();

	}

	public int DaysofMonthsinBetween(MyDate startDate, MyDate endDate) {

		int totalDays = 0;
		for (int index = startDate.getMm() + 1; index < endDate.getMm(); index++) {
			totalDays += months[index - 1];
		}

		return totalDays;
	}

	public int DaysofMonthsforDifferentYear(MyDate startDate, MyDate endDate) {

		int totalDaysStartingYear = 0;
		int totalDaysEndingYear = 0;
		int totalDaysinBetweenYear = 0;
		int totalDaysinBetween = 0;

		for (int index1 = startDate.getMm() + 1; index1 <= 12; index1++) {
			totalDaysStartingYear += months[index1 - 1];
		}

		for (int index2 = 1; index2 < endDate.getMm(); index2++) {
			totalDaysEndingYear += months[index2 - 1];
		}

		for (int year = startDate.getYyyy() + 1; year < endDate.getYyyy(); year++) {
			for (int index3 = 0; index3 < 12; index3++) {
				totalDaysinBetween += months[index3];
			}

		}
		return totalDaysStartingYear + totalDaysEndingYear + totalDaysinBetween;

	}

}
