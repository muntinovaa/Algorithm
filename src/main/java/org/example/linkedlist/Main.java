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



        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);

        System.out.println("DLL before remove():");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() in middle:");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(0).value);
        System.out.println("DLL after remove() of first node:");
        myDLL.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myDLL.remove(2).value);
        System.out.println("DLL after remove() of last node:");
        myDLL.printList();


        /*
            EXPECTED OUTPUT:
            ----------------
            DLL before remove():
            1
            2
            3
            4
            5

            Removed node:
            3
            DLL after remove() in middle:
            1
            2
            4
            5

            Removed node:
            1
            DLL after remove() of first node:
            2
            4
            5

            Removed node:
            5
            DLL after remove() of last node:
            2
            4

        */

    }
}
