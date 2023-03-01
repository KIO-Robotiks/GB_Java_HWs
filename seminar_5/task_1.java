/*
Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.
*/
import java.util.*;

import static java.lang.System.exit;

public class task_1 {

	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		Scanner iScanner = new Scanner(System.in);
		while (true){
			System.out.println("--------------------");
			System.out.println("Currently phonebook:");
			printKeys(map);
			System.out.println("--------------------");
			System.out.println("If you add number enter 'add'");
			System.out.println("If you print all numbers enter 'print'");
			System.out.println("For exit enter 'exit'");
			String choose = iScanner.next();
			System.out.println(choose);
			if (choose.equals("add")) addNumber(map, iScanner);
			else if	(choose.equals("print"))	print(map);
			else if	(choose.equals("exit"))	exit(0);
		}
	}

	static void addNumber(Map<String, List<String>> map, Scanner iScanner){

		System.out.println("Enter human name: ");
		String name = iScanner.next();
		System.out.println("Enter phone number: ");
		String phone = iScanner.next();

		if (map.containsKey(name)){
			List<String> phones = map.get(name);
			phones.add(phone);
		}
		else{
			List<String> phones = new ArrayList<>();
			phones.add(phone);
			map.put(name, phones);
		}
	}

	 static void print(Map<String, List<String>> map){
	 	for (Map.Entry<String, List<String>> entry: map.entrySet()) {
	 		System.out.println(entry.getKey() + ":" + entry.getValue());
	 	}
	 }
	static void printKeys(Map<String, List<String>> map){
		for (Map.Entry<String, List<String>> entry: map.entrySet()) {
			System.out.printf(entry.getKey()+ " ");

		}
		System.out.println();
	}
}