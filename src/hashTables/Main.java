package hashTables;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		
		Employee jane = new Employee("Jane", "Doe", 1001);
		Employee john = new Employee("John", "Doe", 1002);
		Employee mary = new Employee("Mary", "Jane", 1003);
		Employee wilson = new Employee("Wilson", "Perry", 1004);
		
		Map<String, Employee> hashMap = new HashMap<>();
		hashMap.put("jane", jane);
		hashMap.put("john", john);
		hashMap.put("mary", mary);
		hashMap.put("wilson", wilson);
		
		//method 1
//		Iterator<Employee> iterator = hashMap.values().iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());	
//		}
		
		//method 2
		hashMap.forEach((k, v) -> System.out.println("value -> "+v));

	}
	
}
