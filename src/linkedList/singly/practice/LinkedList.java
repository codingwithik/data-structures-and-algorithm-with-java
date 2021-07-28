package linkedList.singly.practice;

import java.util.EmptyStackException;

import linkedList.singly.practice.Node;

public class LinkedList {
	
	//1 -> 2 -> 3 -> 4 -> 5 -> null
	private Node head;
	private int size;
	
	public void addToFront(int data) {
		Node node = new Node(data);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public void insertSorted(int data) {
		if(isEmpty() || head.getHead() > data) {
			addToFront(data);
			return;
		}
		System.out.println("last");
		Node current = head.getNext();
		Node previous = head;
		while(current != null && current.getHead() < data) {
			previous = current;
			current = current.getNext();
		}
		
		Node node = new Node(data);
		node.setNext(current);
		previous.setNext(node);
		size++;
		
	}
	
	public void addToBack(int data) {
		if(isEmpty()) {
			Node newNode = new Node(data);
			newNode.setNext(head);
			head = newNode;
			size++;
		}else {
			Node node = head;
			while(node.getNext() != null) {
				node = node.getNext();
			}
			Node newNode = new Node(data);
			node.setNext(newNode);
			size++;
		}
		
	}
	
	public int getMiddleNode() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Node firstNode = head;
		Node secondNode = head;
		
		while(secondNode.getNext() != null) {
			
			if(secondNode.getNext().getNext() != null) {
				firstNode = firstNode.getNext();
				secondNode = secondNode.getNext().getNext();
			}else {
				break;
			}
			
		}
		
		return firstNode.getHead();
	}
	
	public void reverseLinkedList() {
		
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		Node current = head;
		while(current != null) {
			System.out.print(current.getHead()); 
			System.out.print(" -> "); 
			current = current.getNext();
		}
		System.out.print("null"); 
	}
	
}
