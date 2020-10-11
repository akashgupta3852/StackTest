package com.blz.stack.StackTest;

public class Stack<T> {
	private LinkedList<T> myLinkedList;

	public Stack() {
		myLinkedList = new LinkedList<>();
	}

	public void printWelcome() {
		System.out.println("Welcome to Stack Data Structure");
	}

	public void push(INode<T> newNode) {
		myLinkedList.add(newNode);
	}

	public INode<T> peek() {
		return myLinkedList.head;
	}

	public INode<T> pop() {
		return myLinkedList.pop();
	}

	public void printStack() {
		myLinkedList.printMyNodes();
	}
}
