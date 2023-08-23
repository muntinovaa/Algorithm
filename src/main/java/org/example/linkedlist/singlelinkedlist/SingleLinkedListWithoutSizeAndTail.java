package org.example.linkedlist.singlelinkedlist;

public class SingleLinkedListWithoutSizeAndTail {
    Node head;

    class Node {
        int value;
        Node next;
        Node() {
        }
        Node(int value){
            this.value=value;
        }
    }
    public SingleLinkedListWithoutSizeAndTail(int value) {
        head = new Node(value);     //header should never be null
    }
    void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next= head.next;    //link from newNode to current header.node
        head.next = newNode;        //link from header to newNode
    }

    void addLast(int value) {
        Node newNode = new Node(value);
        Node tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;     //now last is the last non-null node
    }


    int size() {
        if(head.next == null) return 0;
        Node temp = head.next;
        int count = 1;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SingleLinkedListWithoutSizeAndTail list = new SingleLinkedListWithoutSizeAndTail(4);
        list.addFirst(5);
        list.addFirst(6);
        System.out.println(list.size());
    }

}
