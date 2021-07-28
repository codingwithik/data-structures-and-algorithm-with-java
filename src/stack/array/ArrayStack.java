package stack.array;

import java.util.EmptyStackException;

public class ArrayStack {
	
	private Employee[] stack;
	private int top;
	
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	public void push(Employee emp) {
		
		if(top == stack.length) {
			Employee[] newArray = new Employee[stack.length * 2];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		stack[top] = emp; //or stack[top++] = emp
		top++;
	}
	
	public Boolean isEmpty() {
		return top == 0;
	}
	
	public Employee pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		Employee emp = stack[--top];
		stack[top] = null;
		return emp;
	}
	
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		Employee emp = stack[top-1];
		return emp;
	}
	
	public int size() {
		return top;
	}
	
	public void printStack() {
		if(isEmpty()) {
			System.out.println("null");
		}
		
		for(int i = top - 1; i > 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
