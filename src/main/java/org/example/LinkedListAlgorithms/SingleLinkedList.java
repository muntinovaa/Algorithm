package org.example.LinkedListAlgorithms;

public class SingleLinkedList <T> {
        public class Node {
            public T data;
            public Node nextNode;

            Node(T data){
                this.data=data;
                this.nextNode=null;
            }

        }

        public Node headNode;
        public int size;


        public SingleLinkedList() {
            this.headNode = null;
            size = 0;
        }

        public boolean isEmpty() {
            if (headNode == null) return true;
            return false;
        }

       public void insertNode(T data) {
        Node newNode = new Node(data);
        if(isEmpty()){
            headNode=newNode;
            size++;
        }

       }


    public static void main(String[] args) {
        SingleLinkedList<String> list = new SingleLinkedList<String>();

        }




}