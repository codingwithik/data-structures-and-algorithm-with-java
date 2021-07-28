package stack.practice.array;

import java.util.NoSuchElementException;

public class StackArray {
	
	//LIFO - last in first out
	private int[] stack;
	private int top;
	
	public StackArray(int capacity) {
		stack = new int[capacity];
	}
	
	//push
	public void push(int value) {
		stack[top] = value;
		top++;
	}
	//peek
	public int peek() {
		return stack[top-1];
	}
	
	//isEmpty
	public boolean isEmpty() {
		return top == 0;
	}
	
	//size
	public int size() {
		return top;
	}
	
	//pop
	public int pop() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		int num = stack[top-1]; 
		stack[top-1] = 0;
		top--;
		return num;
	}
	//printStack
	public void printStack() {
		for(int i = top-1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
