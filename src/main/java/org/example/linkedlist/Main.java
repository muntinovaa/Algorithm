package org.example.linkedlist;

import sun.awt.image.ImageWatched;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getSize();
        System.out.println("-----------------------");
        myLinkedList.printList();
        System.out.println("-----------------------");
        myLinkedList.addLast(3);
        myLinkedList.addLast(5);
        System.out.println("-----------------------");
        myLinkedList.printList();
        myLinkedList.getSize();
    }
}
