package data.structures.sll;

public class SllMain {
	public static void main(String[] args) {
		SingLinkList sll = new SingLinkList();
		sll.addToFront(2);
		sll.addToFront(1);
		sll.addToFront(10);
		sll.addToIndex(2, 5);
		//System.out.println(sll.giveParam(0));
		sll.deleteAtIndex(1);
		sll.showList();
	}
}
