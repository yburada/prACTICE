package LinkedList;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next= null;
	}
}

public class linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head ;
		head = new Node(10);
		Node n1 = new Node(11);
		Node n2 = new Node(12);
        head.next = n1;
        n1.next = n2;
        while(head != null) {
        	System.out.println(head.data);
        	head = head.next;
        }

	}

}
