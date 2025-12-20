package dev.amit.dsa.stack.dequeueusingstack;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // enqueue using stack //
    public void enqueue(int value) {
        // make sure stack2 is empty
        stack2.empty();

        // pop all items from stack1 and push to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // now stack1 is empty so push new item to stack1
        stack1.push(value);

        // pop all items from stack2 and push back to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // dequeue using stack //
    public Integer dequeue() {
        if (this.isEmpty()) {
            return null;
        }
        return stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}
