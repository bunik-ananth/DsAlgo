package data.structures.doublyll2;

public class DoublyLL {

	public Node head;
	
	public Node tail;
	
	public int size = 0;
	
	public void addToFront(int data) {
		Node insNode = new Node(data);
		if(head==null) {
			head = insNode;
			tail = insNode;
			size++;
		} else {
			Node tmp = head;
			head = insNode;
			insNode.next = tmp;
			tmp.previous = head;
			insNode.previous = null;
			size++;
		}
	}
	
	public void addToLast(int data) {
		Node insNode = new Node(data);
		if(head==null) {
			head = insNode;
			tail = insNode;
			size++;
		} else {
			Node tmp = tail;
			tail = insNode;
			tmp.next = insNode;
			tail.previous = tmp;
		}
		size++;
	}
	
	public void addToIndex(int index, int data) {
		Node insNode = new Node(data);
		if(index==0) {
			addToFront(data);
		} else {
			Node tmp = head;
			for(int i=0; i<index-1;i++) {
				tmp = tmp.next;
			}
			insNode.next = tmp.next;
			insNode.previous = tmp;
			tmp.next = insNode;
			insNode.next.previous = insNode;
		}
		size++;
	}
	
	public void showLL() {
		Node tmp = head;
		while(tmp!=null) {
			System.out.println(tmp.data);
			tmp  = tmp.next;
		}
	}
	
	public int deleteAtIndex(int index) {
		if(index==0) {
			Node tmp =  head;
			head = head.next;
			head.previous = null;
			return tmp.data;
		} else {
			Node tmp = head;
			for(int i=0; i<index-1;i++) {
				tmp = tmp.next;
			}
			Node rmNode = tmp.next;
			tmp.next = rmNode.next;
			rmNode.next.previous = tmp;
			return rmNode.data;
		}
	}
}
