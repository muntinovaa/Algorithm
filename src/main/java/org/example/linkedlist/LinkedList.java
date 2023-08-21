package org.example.linkedlist;

public class LinkedList {

   // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
       Node(){

       }
    }

    Node head;
    Node tail;
    int size;

    public LinkedList(int value){
        Node newNode =new Node(value);
        head=newNode;
        tail=newNode;
        size=1;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getSize() {
        System.out.println("Length: " + size);
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if(size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Node removeLast() {
        if (size == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        size--;

        if (size == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
    public Node removeFirst() {
        return head;
    }
    public void addFirst(int value){
        Node newNode = new Node(value);
        if(size==0){
            head=newNode;
            tail=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }
        size++;
    }

}
