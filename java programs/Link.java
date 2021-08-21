import java.util.*;

class Link {
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("B");
		list1.add("R");
		list1.add("O");
		list1.add("O");
		list1.add("K");
		list1.add("L");
		list1.add("Y");
		list1.add("N");
	
	System.out.println("Initial linked list : "+list1);
	
	LinkedList list2 = new LinkedList();
	list2 = (LinkedList)list1.clone();
	
	Collections.reverse(list2);
	System.out.println("\n New Linked List : "+list2);
	}
}
