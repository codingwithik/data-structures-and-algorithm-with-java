package stack.practice.array;

public class Main {

	public static void main(String[] args) {
		StackArray stack = new StackArray(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		System.out.println("Peeked = "+stack.peek());
		System.out.println("Popped = "+stack.pop());
		System.out.println("Popped = "+stack.pop());
		stack.printStack();
		System.out.println("Size = "+stack.size());
	}

}
