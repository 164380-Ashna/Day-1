package MyCodesForDateDifference;

public class TestDateDifferenceProvider {

	public static void main(String args[]) {

		DateDifferenceProvider1 provider = new DateDifferenceProvider1();

		TestRecord[] records = new TestRecord[15];
		records[0] = new TestRecord(new MyCodesForDateDifference.MyDate(06, 04,
				2011), new MyCodesForDateDifference.MyDate(06, 04, 2011), 0);
		records[1] = new TestRecord(new MyCodesForDateDifference.MyDate(06, 04,
				2011), new MyCodesForDateDifference.MyDate(18, 04, 2011), 12);
		records[2] = new TestRecord(new MyCodesForDateDifference.MyDate(06, 04,
				2011), new MyCodesForDateDifference.MyDate(18, 05, 2011), 42);
		records[3] = new TestRecord(new MyCodesForDateDifference.MyDate(06, 04,
				2011), new MyCodesForDateDifference.MyDate(18, 06, 2011), 73);
		records[4] = new TestRecord(new MyCodesForDateDifference.MyDate(06, 04,
				2011), new MyCodesForDateDifference.MyDate(18, 12, 2011), 256);
		records[5] = new TestRecord(new MyCodesForDateDifference.MyDate(06, 04,
				2011), new MyCodesForDateDifference.MyDate(18, 12, 2012), 622);
		records[6] = new TestRecord(new MyCodesForDateDifference.MyDate(06, 04,
				2011), new MyCodesForDateDifference.MyDate(18, 12, 2013), 987);
		records[7] = new TestRecord(new MyCodesForDateDifference.MyDate(06, 04,
				2011), new MyCodesForDateDifference.MyDate(18, 12, 2113), 37511);
		records[8] = new TestRecord(new MyCodesForDateDifference.MyDate(06, 04,
				2011), new MyCodesForDateDifference.MyDate(18, 12, 2413),
				147084);
		records[9] = new TestRecord(new MyCodesForDateDifference.MyDate(06, 04,
				2011), new MyCodesForDateDifference.MyDate(18, 12, 2813),
				293181);
		records[10] = new TestRecord(new MyCodesForDateDifference.MyDate(06,
				01, 2011), new MyCodesForDateDifference.MyDate(06, 03, 2011),
				59);
		records[11] = new TestRecord(new MyCodesForDateDifference.MyDate(06,
				01, 2012), new MyCodesForDateDifference.MyDate(06, 03, 2012),
				60);
		records[12] = new TestRecord(new MyCodesForDateDifference.MyDate(06,
				02, 2012), new MyCodesForDateDifference.MyDate(06, 03, 2012),
				29);
		records[13] = new TestRecord(new MyCodesForDateDifference.MyDate(22,
				01, 2012), new MyCodesForDateDifference.MyDate(15, 11, 2012),
				298);
		records[14] = new TestRecord(new MyCodesForDateDifference.MyDate(06,
				02, 2012), new MyCodesForDateDifference.MyDate(06, 12, 2012),
				304);

		for (TestRecord record : records) {

			int actualDifference = provider.calculateDifference(
					record.getStartDate(), record.getEndDate());

			if (actualDifference == record.getDifference()) {

				System.out.println("Test Case passed");

			} else {
				System.err.println("Test Case failed" + "actual: "
						+ actualDifference + "Expectedd: "
						+ record.getDifference());
			}

		}
	}

}