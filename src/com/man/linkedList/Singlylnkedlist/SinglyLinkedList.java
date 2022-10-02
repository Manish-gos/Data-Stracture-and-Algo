package com.man.linkedList.Singlylnkedlist;

public class SinglyLinkedList {
	Node head;
	Node tail;
	int size;

	// create linked list O(1) time comp.
	public Node createSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.next = null;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	// Traversal of list O(n)
	public void insertLinkedList(int value, int location) {
		Node node = new Node();
		node.value = value;
		if (head == null) {
			createSinglyLinkedList(value);
			return;
		} else if (location == 0) {
			node.next = head;
			head = node;
		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;
		} else {
			Node tempnode = head;
			int index = 0;
			while (index < location - 1) {
				tempnode = tempnode.next;
				index++;
			}
			Node nextNode = tempnode.next;
			tempnode.next = node;
			node.next = nextNode;
		}
		size++;

	}

	// Traversing O(n)
	public void traverseSiinglyLinkedList() {
		if (head == null) {
			System.out.println("SLL does not exist");
		} else {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.println(tempNode.value);
				if (i != size - 1) {
					System.out.println("->");
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("/n");
	}

	// Searching O(n)
	public boolean searchNode(int nodeValue) {
		if (head != null) {
			Node teampNode = head;
			for (int i = 0; i < size; i++) {
				if (teampNode.value == nodeValue) {
					System.out.println("Found the node at location " + i);
					return true;
				}
				teampNode = teampNode.next;
			}
		}
		System.out.println("node not found");
		return false;
	}

	// Deletion of node O(n)
	public void deletionOfNode(int location) {
		if (head == null)
			System.out.println("Linked list not found");

		else if (location == 0) {
			head = head.next;
			size--;
			if (size == 0)
				tail = null;
		}

		else if (location >= size) {
			Node tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.next;
			}
			if (tempNode == head) {
				tail = head = null;
				size--;
				return;
			}
			tempNode = null;
			tail = tempNode;
			size--;
		}

		else {
			Node tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}
	}
	
	//Delete complete SLL O(n)
	public void deleteSLL() {
		head=null;
		tail=null;
		System.out.println("SLL deleted successfully");
	}
}
