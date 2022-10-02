package com.man.DoublyLinkedList.singlyinkedlist;

public class Main {

	public static void main(String[] args) {
		doublyLinkedList dLL=new doublyLinkedList();
		
		dLL.createdoublyLinkedList(5);
		System.out.println(dLL.head.value+" "+dLL.head.next+" "+dLL.head.prev+" "+dLL.size);
		dLL.insertLinkedList(7, 0);
		dLL.insertLinkedList(2, 1);
		dLL.insertLinkedList(8, 3);
		dLL.insertLinkedList(6, 2);
		dLL.insertLinkedList(10, 1);
		System.out.println(dLL.head.value+" "+dLL.head.next.value+" "+dLL.size);
		dLL.doublyinglyLinkedList();
		dLL.reverseDoublyinglyLinkedList();
		System.out.println(dLL.searchNode(7));
		dLL.deletionOfNode(1);
		dLL.doublyinglyLinkedList();
		dLL.deleteDLL();
		System.out.println(dLL.size+" "+dLL.head.value);
	}

}
