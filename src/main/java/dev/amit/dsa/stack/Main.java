package dev.amit.dsa.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        myStack.printStack();
        System.out.println("Top: " + myStack.getTop().value);
        System.out.println("Height: " + myStack.getHeight());

        System.out.println("Pop starts");
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop());

    }
}
