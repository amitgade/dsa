package dev.amit.dsa.stack.arraylistimpl;

public class TestPush {
    public static void main(String[] args) {
        Stack<Integer> stack;

        // Test 1: Push single element
        System.out.println("Test 1: Push Single Element");
        stack = new Stack<>();
        stack.push(10);
        System.out.println("Expected Stack (top to bottom): 10");
        System.out.println("Actual Stack:");
        stack.printStack();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println();

        // Test 2: Push multiple elements
        System.out.println("Test 2: Push Multiple Elements");
        stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Expected Stack (top to bottom): 3, 2, 1");
        System.out.println("Actual Stack:");
        stack.printStack();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println();

        // Test 3: Peek does not remove element
        System.out.println("Test 3: Peek Does Not Remove");
        stack = new Stack<>();
        stack.push(5);
        stack.push(6);
        System.out.println("Peek before: " + stack.peek());
        System.out.println("Size after peek (expected 2): " + stack.size());
        System.out.println();

        // Test 4: Peek on empty stack
        System.out.println("Test 4: Peek on Empty Stack");
        stack = new Stack<>();
        System.out.println("Expected Peek: null");
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println();
    }
}
