package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode{
	
	int val;
	ListNode next;
	public ListNode(int val) {
		this.val= val;
	}
	public ListNode(ListNode next) {
		this.next= next;
	}
	public ListNode(int val,ListNode next) {
		this.val = val;
		this.next = next;
	}
}
public class dummy {

	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);;
		ListNode list2 = new ListNode(2);
		ListNode list3 = new ListNode(4);
		list1.next = list2;
		list2.next = list3;
		list3.next = null;
		
		ListNode list4 = new ListNode(1);;
		ListNode list5 = new ListNode(3);
		ListNode list6 = new ListNode(4);
		list4.next = list5;
		list5.next = list6;
		list6 = null;
		
	   // List<Integer> ls = new ArrayList<>();		// TODO Auto-generated method stub

		ListNode list = new ListNode(-1);
		ListNode p = list;
		//System.out.println(list1.next.next.val);
		while(list1 != null && list4 != null) {
			
			if(list1.val<list4.val) {
				p.next = list1;
				list1 = list1.next;
			}
			else {
				p.next = list4;
				list4 = list4.next;
			}
			p = p.next;
			
		}
		while(p!=null) {
			System.out.println(p.val);
		}
		
	}

}
