package dev.amit.dsa.datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//        myLinkedList.printList();

        myLinkedList.append(2);
        myLinkedList.printList();
        System.out.println("**************************");

        // (2) items
        System.out.println(myLinkedList.removeLast().value);

        // (1) items
        System.out.println(myLinkedList.removeLast().value);

        // (0) items
        System.out.println(myLinkedList.removeLast());
    }
}
