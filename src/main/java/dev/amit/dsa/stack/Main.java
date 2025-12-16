package dev.amit.dsa.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(3);
        myStack.push(1);
        System.out.println("Top: " + myStack.getTop().value);
        System.out.println("Height: " + myStack.getHeight());
        myStack.printStack();
    }
}
