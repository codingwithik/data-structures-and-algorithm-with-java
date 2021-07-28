package queue.array;

import java.util.NoSuchElementException;

public class ArrayQueue {
	
	private Employee[] queue;
	private int front;
	private int back;
	
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	public void enqueue(Employee emp) {
		if(size() == queue.length - 1) {
			int numItems = size();
			Employee[] newArray = new Employee[queue.length * 2];
			System.arraycopy(queue, front, newArray, 0, queue.length - 1);
			System.arraycopy(queue, 0, newArray, queue.length - 1, back);
			queue = newArray;
			front = 0;
			back = numItems;
		}
		
		queue[back] = emp;
		if(back < queue.length - 1)
			back++;
		else
			back = 0;
	}
	
	public Employee dequeue() {
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		Employee emp = queue[front];
		queue[front] = null;
		front++;
		if(size() == 0) {
			front = 0;
			back = 0;
		}else if(front == queue.length) {
			front = 0;
		}
		return emp;
	}
	
	public int size() {
		if(front <= back)
			return back - front;
		
		return back - front + queue.length;
	}
	
	public Employee peek() {
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		return queue[front];
	}
	
	public void printQueue() {
		if(front <= back) {
			for(int i = front; i < back; i++) {
				System.out.println(queue[i]);
			}
		}else {
			for(int i = front; i < queue.length; i++) {
				System.out.println(queue[i]);
			}
			
			for(int i = 0; i < back; i++) {
				System.out.println(queue[i]);
			}
		}
		
	}
}
