package dev.amit.dsa.linkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node removeFirst() {
        if (length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0) tail = null;

        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        {
            Node newNode = new Node(value);
            Node temp = get(index - 1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;
        }
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;

        if (index == 0) return removeFirst();

        if (index == length - 1) return removeLast();

        {
            Node prev = get(index - 1);
            Node temp = prev.next;
            prev.next = temp.next;
            temp.next = null;
            length--;
            return temp;
        }
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    // FIND MIDDLE NODE //
    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // HASLOOP METHOD // - Floyd's Tortoise and Hare algorithm
    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Find k-th Node from end
    // Solution 1
//    public Node findKthFromEnd(int k) {
//        if (k <= 0) return null;
//        Node slow = head;
//        Node fast = head;
//        int i = 0;
//        while (fast != null) {
//            fast = fast.next;
//            if (i >= k) {
//                slow = slow.next;
//            }
//            i++;
//        }
//        if (k > i) return null;
//        return slow;
//    }
    // Solution 2
    public Node findKthFromEnd(int k) {
        if (k <= 0) return null;

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
    // REMOVEDUPLICATES METHOD - brute-force approach//
//    public void removeDuplicates() {
//        Node current = head;
//
//        while (current != null) {
//            Node runner = current;
//            while (runner.next != null) {
//                if (current.value == runner.next.value) {
//                    runner.next = runner.next.next;
//                    length--;
//                } else {
//                    runner = runner.next;
//                }
//            }
//            current = current.next;
//        }
//    }

    // REMOVEDUPLICATES METHOD - using HashSet //
    public void removeDuplicates() {
        Set<Integer> values = new HashSet<>();
        Node previous = null;
        Node current = head;
        while (current != null) {
            if (values.contains(current.value)) {
                previous.next = current.next;
                length -= 1;
            } else {
                values.add(current.value);
                previous = current;
            }
            current = current.next;
        }
    }

    //  binaryToDecimal
    public int binaryToDecimal() {
        int decimalVal = 0;
        Node current = head;
        while (current != null) {
            decimalVal = (decimalVal * 2) + current.value;
            current = current.next;
        }
        return decimalVal;
    }

    // PARTITION LIST //
    public void partitionList(int x) {
        if (head == null) return;
        Node d1 = new Node(0);
        Node d2 = new Node(0);
        Node prev1 = d1;
        Node prev2 = d2;
        Node current = head;

        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next = null;
        prev1.next = d2.next;
        head = d1.next;

//        for (int i = 0; i < length; i++) {
//            if (current.value < x) {
//                prev1.next = current;
//                prev1 = prev1.next;
//            } else {
//                prev2.next = current;
//                prev2 = prev2.next;
//            }
//            current = current.next;
//        }
//        prev2.next = null;
//        prev1.next = d2.next;
//        head = d1.next;
    }

}
