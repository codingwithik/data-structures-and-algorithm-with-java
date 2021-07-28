package linkedList.singly.practice;

public class Node {
	
	private Node next;
	private int head;
	
	public Node(int head) {
		this.head = head;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getHead() {
		return head;
	}

	public void setHead(int head) {
		this.head = head;
	}
	
	
}
