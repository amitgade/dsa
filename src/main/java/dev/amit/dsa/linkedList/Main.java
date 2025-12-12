package dev.amit.dsa.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(5);
        myLinkedList.prepend(4);
        myLinkedList.prepend(3);
        myLinkedList.prepend(2);
        myLinkedList.prepend(1);

        System.out.println(myLinkedList.get(0).value);
        System.out.println(myLinkedList.get(1).value);
        System.out.println(myLinkedList.get(2).value);
        System.out.println(myLinkedList.get(3).value);
        System.out.println(myLinkedList.get(4).value);
        System.out.println(myLinkedList.get(-1));
        System.out.println(myLinkedList.get(5));

    }
}
