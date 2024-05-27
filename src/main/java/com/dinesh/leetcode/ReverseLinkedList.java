package com.dinesh.leetcode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		Node head=new Node(2);
		head.next=new Node(3);
		head.next.next=new Node(4);
		head.next.next.next=new Node(5);
		head.next.next.next.next=new Node(8);
		head.next.next.next.next.next=new Node(1);
		head.next.next.next.next.next.next=new Node(6);
		reverseLinkedList(head);
	}

	private static void reverseLinkedList(Node head) {
		Node prev=null;
		Node current=head;
		
		while(current!=null) {
			Node next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		System.out.println(head);
	}

}
