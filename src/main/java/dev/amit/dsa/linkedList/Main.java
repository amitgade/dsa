package dev.amit.dsa.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(5);
        myLinkedList.prepend(4);
        myLinkedList.prepend(3);
        myLinkedList.prepend(2);
        myLinkedList.prepend(1);
        myLinkedList.printList();

    }
}
