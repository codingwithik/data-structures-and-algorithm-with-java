package linkedList.singly;

public class EmployeeLinkedList {
	
	//A linked list is the best data structure if you're
	//only going to be accessing what's at the head of the list
	private EmployeeNode head;
	private int size;
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
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
		head = head.getNext();
		size--;
		removeNode.setNext(null);
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
