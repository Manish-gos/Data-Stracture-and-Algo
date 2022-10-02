package com.man.linkedList.circularsinglylinkedlist;

public class Main {

	public static void main(String[] args) {
		CircularSinglyLinkedList sLL=new CircularSinglyLinkedList();
		
		sLL.createCSLL(5);
		System.out.println(sLL.head.value+" "+sLL.head.next+" "+sLL.size);
		/*
		 * sLL.insertLinkedList(7, 1); sLL.insertLinkedList(6, 2);
		 * System.out.println(sLL.head.value+" "+sLL.head.next.next.value+" "+sLL.size);
		 * sLL.traverseSiinglyLinkedList(); System.out.println(sLL.searchNode(7));
		 * sLL.deletionOfNode(1); sLL.traverseSiinglyLinkedList();
		 */

	}

}
