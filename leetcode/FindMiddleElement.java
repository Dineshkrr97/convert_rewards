package com.dinesh.leetcode;

public class FindMiddleElement {

	public static void main(String[] args) {
		
		Node head=new Node(2);
		head.next=new Node(3);
		head.next.next=new Node(4);
		head.next.next.next=new Node(5);
		head.next.next.next.next=new Node(8);
		head.next.next.next.next.next=new Node(1);
		head.next.next.next.next.next.next=new Node(6);
		
		findMiddle(head);
	}
	
	public static int findMiddle(Node head) {
		Node fast=head;
		Node slow=head;
		
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		
		System.out.println(slow.data);
		return slow.data;
	}

}
