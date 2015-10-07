package leetcode232;

import java.util.Stack;

class MyQueue {
    // Push element x to the back of queue.
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> retrieve = new Stack<Integer>();
    public void push(int x) {
        stack.push(x);
    }
    // Removes the element from in front of queue.
    public void pop() {
    	while(!stack.isEmpty())
        	retrieve.push(stack.pop());
        retrieve.pop();
        while(!retrieve.isEmpty())
        	stack.add(retrieve.pop());
    }

    // Get the front element.
    public int peek() {
    	while(!stack.isEmpty())
        	retrieve.push(stack.pop());
    	return retrieve.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}