package Ques5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FirstLetterTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Ashna");
		list.add("Kashyap");
		list.add("Prince");
		list.add("Shubham");
		list.add("Sharma");

		List<String> newstring = list.stream()
				.map(n -> (n.replace(n, n.substring(0, 1))))
				.collect(Collectors.toList());
		System.out.println(newstring);

	}
}
