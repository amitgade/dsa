package dev.amit.dsa.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(13);

        System.out.println("First: " + myQueue.getFirst().value);
        System.out.println("Last: " + myQueue.getLast().value);
        System.out.println("Length: " + myQueue.getLength());

        myQueue.printQueue();
    }
}
