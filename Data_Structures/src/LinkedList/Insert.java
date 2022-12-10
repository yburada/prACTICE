package LinkedList;

class Node1{
	int data;
	Node1 next;
	Node1(int data){
		this.data = data;
		this.next = null;
	}
}
public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node1 head;
		head = new Node1(10);
		Node1 n1 = new Node1(11);
		Node1 n2 = new Node1(12);
		Node1 n3 = new Node1(13);
		Node1 n4 = new Node1(14);
		Node1 n5 = new Node1(15);
		Node1 n3_5 = new Node1(15);
		head.next =n1;
		n1.next = n2;
		n2.next = n3;
		n3.next =n4;
		n4.next = n5;
		
		display(head);
		
		insert(head,5,n3_5);
		
		System.out.println();
		
		display(head);

	}
	
	public static void display(Node1 head) {
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public static void insert(Node1 head, int index, Node1 n3_5) {
		int i =0;
		Node1 bal; 
		if(index==0) {
			bal = head;
			n3_5.next = head;
	        n3_5 = head;
		}
		else {
			index-=1;
			while(head != null) {
				if(i==index) {
					bal = head.next;
					head.next = n3_5;
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
