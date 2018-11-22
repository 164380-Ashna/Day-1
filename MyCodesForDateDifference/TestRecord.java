package MyCodesForDateDifference;

import MyCodesForDateDifference.MyDate;


public class TestRecord {
	
	private MyDate startDate;
	private MyDate endDate;
	private  int difference;

	public TestRecord(MyDate startDate, MyDate endDate, int difference) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.difference = difference;
	}

	public MyDate getStartDate() {
		return startDate;
	}

	public void setStartDate(MyDate startDate) {
		this.startDate = startDate;
	}

	public MyDate getEndDate() {
		return endDate;
	}

	public void setEndDate(MyDate endDate) {
		this.endDate = endDate;
	}

	public int getDifference() {
		return difference;
	}

	public void setDifference(int difference) {
		this.difference = difference;
	}

	@Override
	public String toString() {
		return "MyTestRecord [startDate=" + startDate + ", endDate=" + endDate
				+ ", difference=" + difference + "]";
	}

}



