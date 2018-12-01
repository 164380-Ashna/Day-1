package Ques3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfaceToCheck {

	public static void main(String[] args) {
		Consumer<Integer> consumer = i -> System.out.println(i);
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		printList(list, consumer);
		List<Integer> newlist2=list.stream().filter(i->i>20).collect(Collectors.toList());
		System.out.println(newlist2);
		List<Integer> newlist3=list.stream().map(i->i+20).collect(Collectors.toList());
		System.out.println(newlist3);
		Supplier<String> DemoSupplier = () -> new String("Program Over");
		  String printstring = DemoSupplier.get();
		  System.out.println("The bottom line is ->"+printstring+"<-");

	}

	public static void printList(List<Integer> newlist,
			Consumer<Integer> consumer) {
		for (Integer integer : newlist) {
			consumer.accept(integer);
		}
	}

}
