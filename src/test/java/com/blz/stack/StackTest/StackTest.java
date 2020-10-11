package com.blz.stack.StackTest;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
	@Test
	public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		Stack<Integer> myStack = new Stack<>();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode<Integer> peekNode = myStack.peek();
		boolean result = peekNode.equals(myThirdNode);
		Assert.assertTrue(result);
	}

	@Test
	public void given3NumbersInStackWhenPoppedShouldMatchWithLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		Stack<Integer> myStack = new Stack<>();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		INode<Integer> poppedNode = myStack.pop();
		myStack.printStack();
		boolean result = poppedNode.equals(myThirdNode);
		Assert.assertTrue(result);
	}

}
