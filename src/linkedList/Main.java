package linkedList;

public class Main {
	
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(10);
		list.insert(18);
		list.insertAtStart(25);
		
		list.insertAt(2, 55);
		list.deleteAt(3);
		
		list.show();
	}
}
