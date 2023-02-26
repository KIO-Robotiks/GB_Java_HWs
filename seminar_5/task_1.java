/*
Реализуйте структуру телефонной книги с помощью HashMap,
учитывая, что 1 человек может иметь несколько телефонов.
*/
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Map<String, List<String>> map = new HashMap<>();
		Scanner iScanner = new Scanner(System.in);

		addNumber();
		// print();

		iScanner.close();

	}

	static void addNumber(){

		System.out.println("Enter human name: ");
		String name = iScanner.next();
		System.out.println("Enter phone number: ");
		String phone = iScanner.next();

		if (map.containskey(name)){
			List<String> phones = map.get(name);
			phones.add(phone);
		}
		else{
			List<String> phones = new ArrayList<>();
			phones.add(phone);
			map.put(name, phones);
		}
	}

	// static void print(){
	// 	for (Map.Entry<String, List<String>> entry: map.entrySet()) {
	// 		System.out.println(entry.getKey() + ":" + entry.getValue());
	// 	}
	// }
}