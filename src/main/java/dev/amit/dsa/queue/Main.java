package dev.amit.dsa.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(11);
        myQueue.enqueue(22);

//        System.out.println("First: " + myQueue.getFirst().value);
//        System.out.println("Last: " + myQueue.getLast().value);
//        System.out.println("Length: " + myQueue.getLength());

//        myQueue.printQueue();

        System.out.println(myQueue.dequeue().value); // returns 11
        System.out.println(myQueue.dequeue().value); // returns 22
        System.out.println(myQueue.dequeue()); // returns null
    }
}
