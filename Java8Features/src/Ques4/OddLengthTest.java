package Ques4;

import java.util.ArrayList;
import java.util.List;

public class OddLengthTest {

	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Ashna");
		list.add("Kashyap");
		list.add("Prince");
		list.add("Shubham");
		list.add("Sharma");
		
		list.removeIf(n->(n.length()%2!=0));
		
		System.out.println(list);

	}

}
