package stack.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
	
	LinkedList<Employee> stack;
	
	public LinkedStack() {
		stack = new LinkedList<Employee>();
	}
	
	public void push(Employee emp) {
		stack.push(emp);
	}
	
	public Employee pop() {
		return stack.pop();
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		ListIterator<Employee> iterator = stack.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public boolean checkIfIsPalindrome(String input) {
		LinkedList<Character> stack = new LinkedList<Character>();
		String newString = input.toLowerCase();
		StringBuilder string = new StringBuilder(input.length());
		for(int i = 0; i < input.length(); i++) {
			char c = newString.charAt(i);
			string.append(c);
			stack.push(c);
		}
		
		String reversedString = "";
		while(!stack.isEmpty()) {
			reversedString += stack.pop();
		}
		
		System.out.println(reversedString.toString());
		System.out.println(input);
	
		return reversedString.toString().equals(input);
	}
}
