package Ques7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AppendSingleString {
	
	public static void main(String args[]){
		
		Map<Integer,Integer> salaryorder =new HashMap<>();
		salaryorder.put(1, 1000);
		salaryorder.put(2, 2000);
		salaryorder.put(3, 3000);
		salaryorder.put(4, 4000);
		salaryorder.put(5, 5000);
		
		System.out.println(salaryorder);
		
		Set newset=salaryorder.entrySet();
		
		System.out.println(newset);
		//Set newStringset=(Set) newset.stream().map(n->n.toString());
		
	
	}

}
