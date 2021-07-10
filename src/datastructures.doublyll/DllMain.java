package data.structures.doublyll2;

public class DllMain {
	public static void main(String[] args) {
		DoublyLL dll = new DoublyLL();
		dll.addToFront(1);
		dll.addToFront(4);
		dll.addToLast(5);
		dll.addToIndex(1, 6);
		System.out.println("deleted element="+dll.deleteAtIndex(1));
		dll.showLL();
	}
}
