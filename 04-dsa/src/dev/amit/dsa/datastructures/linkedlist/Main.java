package dev.amit.dsa.datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
//        /*
//        getHead, getTail, getLength, printList
//         */
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//        myLinkedList.printList();

//        /*
//        append(value)
//         */
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.printList();

//        /*
//        removeLast
//         */
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.printList();
//
//        System.out.println("*********** removeLast ***************");
//        // (2) items
//        System.out.println(myLinkedList.removeLast().value);
//
//        // (1) items
//        System.out.println(myLinkedList.removeLast().value);
//
//        // (0) items
//        System.out.println(myLinkedList.removeLast());


//        /*
//        prepend(value)
//         */
//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(3);
//        myLinkedList.printList();
//        System.out.println("************* prepend **************");
//        myLinkedList.prepend(1);
//        myLinkedList.printList();

//        /*
//        RemoveFirst
//         */
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.printList();
//        System.out.println("************ RemoveFirst **************");
//
//        // (2) items
//        System.out.println(myLinkedList.removeFirst().value);
//
//        // (1) items
//        System.out.println(myLinkedList.removeFirst().value);
//
//        // (0) items
//        System.out.println(myLinkedList.removeFirst());

//        /*
//        get(index)
//         */
//        LinkedList myLinedList = new LinkedList(0);
//        myLinedList.append(1);
//        myLinedList.append(2);
//        myLinedList.append(3);
//        myLinedList.printList();
//        System.out.println("************ get(i) **************");
//        System.out.println(myLinedList.get(2).value);
//        System.out.println("************ get(index) **************");
//        myLinedList.printList();

//        /*
//        set(index, value)
//         */
//        LinkedList myLinkedList = new LinkedList(21);
//        myLinkedList.append(3);
//        myLinkedList.append(54);
//        myLinkedList.append(8);
//        myLinkedList.printList();
//        System.out.println("************ set(index, value) **************");
//        myLinkedList.set(2, 6);
//        myLinkedList.printList();

//        /*
//        insert(index, value)
//         */
//        LinkedList myLinkedList = new LinkedList(0);
//        myLinkedList.append(2);
//        myLinkedList.printList();
//        System.out.println("************ insert(index, value) **************");
//        myLinkedList.insert(1, 1);
//        myLinkedList.printList();

        /*
        remove(index)
         */
        LinkedList myLinkedList = new LinkedList(21);
        myLinkedList.append(3);
        myLinkedList.append(54);
        myLinkedList.append(8);
        myLinkedList.printList();
        System.out.println("************ remove(index) **************");
        myLinkedList.remove(2);
        myLinkedList.printList();
    }
}
