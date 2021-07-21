package linkedlist.singlylinkedlist;

public class SinglyLinkedListImpl {

	private class Node{
		private int data;
		private Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	public Node head;
	
	public void addToFront(int data) {
		Node newNode = new Node(data);
		if(head== null)
			head = newNode;
		else {
			Node temp = head;
			head = newNode;
			newNode.next = temp;
			
		}
	}
	
	
	public void showList() {
		Node temp = head;
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public void addToIndex(int index, int data) {
		if(head == null)
			addToFront(data);
		else {
			Node newNode = new Node(data);
			Node temp = head;
			for(int i=0; i<index-1; i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	} 
	
	
	public void delete(int index) {
		Node temp = head;
		if(index == 0) {
			head= head.next;
		}
		else {
			for(int i=0; i<index-1; i++) {
				temp = temp.next;
				
			}
			temp.next = temp.next.next;
		}
		
	}
	
	public int getDataAtParticularIndex(int index) {
		Node temp = head;
		int i=0;
		if(index == 0)
			return head.data;
		else {
			while(temp.next!=null) {
				temp = temp.next;
				i++;
				if(i==index) {
					return temp.data;
				}
				
			}
			return temp.data;
		}
	}
	
	
	public static void main(String[] args) {
		SinglyLinkedListImpl sll = new SinglyLinkedListImpl();
		sll.addToFront(2);
		sll.addToFront(1);
		sll.addToFront(10);
		sll.addToIndex(2, 5);
		
//		sll.deleteAtIndex(1);
		sll.showList();
		sll.delete(1);
		System.out.println(sll.getDataAtParticularIndex(1));
		sll.showList();
	}
}
