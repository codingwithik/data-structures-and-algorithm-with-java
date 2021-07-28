package linkedList.doubly;


public class Main {

	public static void main(String[] args) {
		
		Employee jane = new Employee("Jane", "Doe", 1001);
		Employee john = new Employee("John", "Doe", 1002);
		Employee mary = new Employee("Mary", "Jane", 1003);
		Employee wilson = new Employee("Wilson", "Perry", 1004);
		
		EmployeeDoublyLinkedList linkedList = new EmployeeDoublyLinkedList();
		
//		linkedList.addToFront(wilson);
		linkedList.addToFront(mary);
//		linkedList.addToFront(jane);
		linkedList.addBefore(john, mary);
		
		linkedList.printList();

	}

}
