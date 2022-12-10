package LinkedList;

class Node0{
	int n ;
	Node0 previous;
	Node0 next;
	
	Node0(int n){
		this.n= n;
		this.previous = null;
		this.next = null;
	}
	
}

public class Dual_LinkedList {

	public static void main(String[] args) {
		
		Node0 head;
		
		head = new Node0(1);
		Node0 n1 = new Node0(2);
		Node0 n2 = new Node0(3);
		Node0 n3 = new Node0(4);
		Node0 n4 = new Node0(5);
		
		head.next= n1;
		n1.previous = head;
		n1.next = n2;
		n2.previous = n1;
		n2.next = n3;
		n3.previous = n2;
		n3.next = n4;
		n4.previous = n3;
		
		Node0 n15 = new Node0(15);
		
		display(head);
		System.out.println();
		reverseDisplay(n4);
		System.out.println();
		insert(head,0,n15);
		display(head);

	}
	
	public static void display(Node0 head) {
		while(head != null) {
			System.out.println(head.n);
			head = head.next;
		}
	}
	
	public static void reverseDisplay(Node0 last) {
		while(last != null) {
			System.out.println(last.n);
			last = last.previous;
		}
	}
	
	public static void insert(Node0 head,int index,Node0 n15) {
		int i=0;
		Node0 bal;
		if(index==0) {
			bal = head;
			n15.next = head;
			n15.previous =null;
	        n15 = head;
		}
		else {
			index-=1;
			while(head != null) {
				if(i==index) {
					bal = head.next;
					head.next = n15;
					head.next.next = bal;
				}
				else {
					head = head.next;
				}
				i++;
			}
		}
	}

}
