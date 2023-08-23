package org.example.tests.linkedlist.singlelinkedlist;

public class Node {

   public String value;
   public Node next;

   public Node(){}

   public Node(String value, Node next){
       this.value=value;
       this.next=next;
   }

    @Override
    public String toString() {
        return value;
    }
}
