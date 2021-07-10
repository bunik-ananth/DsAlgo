package data.structures.sll;

public class SingLinkList {
	
	public Node head;
	
	public void addToFront(int i) {
		Node insNode = new Node(i);
		if (null == head)
			head = insNode;
		else {
			Node tmp = head;
			head = insNode;
			insNode.next = tmp;
		}
		
	}
	
	public void showList() {
		Node tmp = head;
		
		while(tmp.next != null) {
			System.out.println(tmp.data);
			tmp= tmp.next;
		}
		System.out.println(tmp.data);
	}
	
	public int giveParam(int index) {
		Node tmp = head;
		int i= 0;
		if(index == 0)
			return head.data;
		else {
			while(tmp.next != null) {
				tmp = tmp.next;
				i++;
				if(i==index)
					return tmp.data;
			}
			return tmp.data;
		}
	}
	
	public void addToIndex(int index, int data) {
		if(index==0)
			addToFront(data);
		
		
		Node insNode = new Node(data);
		Node tmp = head;
		for(int i=0; i<index-1;i++) {
			tmp = tmp.next;
		}
		insNode.next =  tmp.next;
		tmp.next = insNode;
	}
	
	public void deleteAtIndex(int index) {
		Node tmp = head;
		if(index==0) {
			head = head.next;
		} else {
			for(int i=0;i<index-1;i++) {
				tmp = tmp.next;
			}
			 tmp.next = tmp.next.next;
		}
		
	}
	

}
