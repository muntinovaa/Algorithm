package org.example.linkedlist;

import sun.awt.image.ImageWatched;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        System.out.println("-----------------------");
        myLinkedList.printList();
        System.out.println("-----------------------");
        myLinkedList.append(3);
        myLinkedList.append(5);
        System.out.println("-----------------------");
        myLinkedList.printList();
        myLinkedList.getLength();
        System.out.println("LL before reverse():");
        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLL after reverse():");
        myLinkedList.printList();
    }
}
