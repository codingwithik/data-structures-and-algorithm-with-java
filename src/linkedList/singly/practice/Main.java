package linkedList.singly.practice;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linked = new LinkedList();

		
		
//		linked.addToBack(6);
//		linked.addToFront(1);
//		linked.addToFront(2);
//		linked.addToFront(3);
//		linked.addToFront(4);
//		linked.addToFront(5);
//		linked.addToBack(7);
//		linked.printList();
//		
//		System.out.println("\n Middle Node is = "+ linked.getMiddleNode());
		
		linked.insertSorted(7);
		linked.insertSorted(2);
		linked.insertSorted(3);
		linked.insertSorted(1);
		linked.insertSorted(4);
		
		
		
		
		linked.printList();
	}

}
