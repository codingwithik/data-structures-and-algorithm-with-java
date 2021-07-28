package linkedList.doubly;

import java.util.EmptyStackException;

public class EmployeeDoublyLinkedList {
	
	//A linked list is the best data structure if you're
	//only going to be accessing what's at the head of the list
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if(head == null)
			tail = node;
		else {
			head.setPrevious(node);
			node.setNext(head);
		}
		head = node;
		size++;
	}
	
	public void addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if(tail == null)
			head = node;
		else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}
	
	public void addBefore(Employee newEmployee, Employee existingEmployee) {
		if(isEmpty())
			throw new EmptyStackException();
		
		EmployeeNode current = head;
		while(current != null && !current.getEmployee().equals(existingEmployee)) {
			
			current = current.getNext();
			System.out.println("current = "+current);
		}
		
		if(current == null) {
			System.out.println("Employee not found");
		}else {
			
			EmployeeNode newNode = new EmployeeNode(newEmployee);
			newNode.setPrevious(current.getPrevious());
			newNode.setNext(current);
			current.setPrevious(newNode);
			
			if(head == current) {
				head = newNode;
			}else {
				newNode.getPrevious().setNext(newNode);
			}
			
			size++;
			
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public EmployeeNode removeNode() {
		if(isEmpty())
			return null;
		
		EmployeeNode removeNode = head;
		if(head.getNext() == null) {
			tail = null;
		}else {
			head.getNext().setPrevious(null);
		}
		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
	}
	
	public EmployeeNode removeFromEnd() {
		if(isEmpty())
			return null;
		
		EmployeeNode removeNode = tail;
		
		if(tail.getPrevious() == null) {
			head = null;
		}else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		size--;
		removeNode.setPrevious(null);
		return removeNode;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("Head -> ");
		while(current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.print("null");
	}
	
}
