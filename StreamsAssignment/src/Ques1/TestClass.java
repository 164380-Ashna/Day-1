package Ques1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {

	public static void main(String[] args) {

		List<Fruits> fruits = new ArrayList<Fruits>();
		List<Trader> trader = new ArrayList<Trader>();
		List<Transaction> transaction = new ArrayList<Transaction>();
		List<News> news = new ArrayList<News>();

		fruits.add(new Fruits("Apple", 20, 150, "red"));
		fruits.add(new Fruits("Mango", 30, 170, "yellow"));
		fruits.add(new Fruits("Guava", 150, 100, "green"));
		fruits.add(new Fruits("Orange", 250, 130, "orange"));
		fruits.add(new Fruits("chiku", 27, 110, "brown"));
		fruits.add(new Fruits("Strawberry", 35, 159, "red"));

		trader.add(new Trader("Ashna", "Mumbai"));
		trader.add(new Trader("Shubham", "Mumbai"));
		trader.add(new Trader("Prince", "Delhi"));
		trader.add(new Trader("Adarsh", "Delhi"));
		trader.add(new Trader("Seema", "Pune"));
		trader.add(new Trader("Arvind", "Pune"));

		transaction.add(new Transaction(new Trader("Ashna", "Mumbai"), 2011,
				101));
		transaction.add(new Transaction(new Trader("Shubham", "Mumbai"), 2013,
				102));
		transaction.add(new Transaction(new Trader("Prince", "Delhi"), 2011,
				103));
		transaction.add(new Transaction(new Trader("Adarsh", "Delhi"), 2012,
				104));
		transaction
				.add(new Transaction(new Trader("Seema", "Pune"), 2011, 105));
		transaction
				.add(new Transaction(new Trader("Arvind", "Pune"), 2016, 106));

		System.out
				.println("------- Ques 1 For displaying Low Caolories fruits--------------");
		System.out.println();

		List<Fruits> lowCalorieFruits = fruits
				.stream()
				.filter(i -> (i.getCalories() < 100))
				.sorted((i1, i2) -> (i1.getCalories()) > i2.getCalories() ? -1
						: (i1.getCalories() < i2.getCalories() ? 1 : 0))
				.collect(Collectors.toList());

		System.out.println(lowCalorieFruits);

		for (Fruits i : lowCalorieFruits) {
			System.out.println(i.getName() + " " + i.getCalories());
		}

		System.out.println();
		System.out
				.println("------- "
						+ "ques 2 For displaying alphabetically sorted color names---------");
		System.out.println();
		fruits.stream()
				.sorted((p1, p2) -> p1.getColor().compareTo(p2.getColor()))
				.forEach(System.out::println);

		System.out.println();
		System.out
				.println("---------------Ques 3 For displaying sorting on the basis of color red-----------");
		System.out.println();

		List<Fruits> redColorSorting = fruits
				.stream()
				.filter(i -> i.getColor() == "red")
				.sorted((i1, i2) -> (i1.getPrice() > i2.getPrice() ? 1 : (i1
						.getPrice() < i2.getPrice() ? -1 : 0)))
				.collect(Collectors.toList());

		System.out.println(redColorSorting);

		System.out.println();
		System.out
				.println("--------------Ques 8 For displaying transactions in 2011-----------");
		System.out.println();

		List<Transaction> transactionIn2011 = transaction
				.stream()
				.filter(i -> i.getYear() == 2011)
				.sorted((i, j) -> (i.getYear() > j.getYear() ? 1
						: i.getYear() < j.getYear() ? -1 : 0))
				.collect(Collectors.toList());
		System.out.println(transactionIn2011);

		System.out.println();
		System.out
				.println("--------------Ques 9 For displaying sorting on the basis of city Pune-----------");
		System.out.println();

		Stream<Trader> stream11 = trader.stream();
		System.out.println("distinct city");
		stream11.map(Trader::getCity).distinct().forEach(System.out::println);

		System.out.println();
		System.out
				.println("--------------Ques 10 For displaying sorting on the basis of city Pune-----------");
		System.out.println();

		trader.stream().filter(i -> (i.getCity() == "Pune"))
				.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
				.forEach(System.out::println);

		System.out.println();
		System.out
				.println("---------------  Ques 11 For displaying names of traders alphabetically-----------");
		System.out.println();

		trader.stream()
				.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
				.forEach(System.out::println);

		System.out.println();
		System.out
				.println("--------------Ques 12 For checking indore is present or not-----------");
		System.out.println();

		List<Trader> indorecheck = trader.stream()
				.filter(i -> (i.getCity() == "Indore"))
				.collect(Collectors.toList());
		if (indorecheck == null) {
			System.out.println("Present");
		} else {
			System.out.println("Not present");
		}

		System.out.println();
		System.out
				.println("--------------Ques 13 For checking transactions in delhi-----------");
		System.out.println();
		List<Transaction> delhiTransaction = transaction.stream()
				.filter(i -> i.getTrader().getCity() == "Delhi")
				.collect(Collectors.toList());
		System.out.println(delhiTransaction);

		System.out.println();
		System.out
				.println("--------------Ques 14 For checking maximum value in transaction-----------");
		System.out.println();

		Comparator<Transaction> transactionobj = Comparator
				.comparing(Transaction::getValue);

		Transaction maxValue = transaction.stream().max(transactionobj).get();
		System.out.println("Max value is  " + maxValue.getValue());

		System.out.println();
		System.out
				.println("--------------Ques 15 For checking minimum transaction-----------");
		System.out.println();

		Transaction minTransaction = transaction.stream().min(transactionobj).get();
		System.out.println("Min transaction is  " + minTransaction);

	}

}
