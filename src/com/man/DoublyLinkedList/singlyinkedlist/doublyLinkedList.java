package com.man.DoublyLinkedList.singlyinkedlist;

public class doublyLinkedList {
	Node head;
	Node tail;
	int size;

	// create linked list O(1) time comp.
	public Node createdoublyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.value = nodeValue;
		node.next = null;
		node.prev=null;
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
			createdoublyLinkedList(value);
			return;
		} else if (location == 0) {
			node.next = head;
			node.prev=null;
			head.prev=node;
			head = node;
		} else if (location >= size) {
			node.next = null;
			node.prev=tail;
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
			node.prev=tempnode;
			tempnode.next = node;
			node.next = nextNode;
			nextNode.prev=node;
		}
		size++;

	}

	// Traversing O(n)
	public void doublyinglyLinkedList() {
		if (head == null) {
			System.out.println("dLL does not exist");
		} else {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print("->");
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("");
	}

	public void reverseDoublyinglyLinkedList() {
		if (head == null) {
			System.out.println("dLL does not exist");
		} else {
			Node tempNode = tail;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if (i != size - 1) {
					System.out.print("<-");
				}
				tempNode = tempNode.prev;
			}
		}
		System.out.println("");
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
			head.prev=null;
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
			tempNode.prev=tail;
			tail = tempNode;
			size--;
		}

		else {
			Node tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			tempNode.next.prev=tempNode;
			size--;
		}
	}
	
	//Delete complete SLL O(n)
	public void deleteDLL() {
		Node tempNode = head;
		for (int i = 0; i < size - 1; i++) {
			tempNode.prev=null;
			tempNode = tempNode.next;
		}
		head=null;
		tail=null;
		size=0;
		System.out.println("DLL deleted successfully");
	}
}
