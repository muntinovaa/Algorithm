package org.example.tests.linkedlist.singlelinkedlist;

public class SingleLinkedList {
    private Node head;
    private Node last;
    private int size = 0 ;

    public void add(String value){
       Node node =new Node(value,null);
       if (head==null) {
           System.out.println("head is null adding head");
           head = node;
       }else {
           System.out.println("head is not null adding new last");
           Node last = head;
           while (last.next != null) {
               last = last.next;
           }
           last.next = node;
       }
       size ++;
        System.out.println("adding done");
    }

    public void addV2(String value){
        Node node =new Node(value,null);
        if (head==null) {
            System.out.println("v2 head is null adding head");
            head = node;
            last=head;
        }else {
            System.out.println("v2 head is not null adding new last");
            last.next = node;
            last=last.next;
        }
        size ++;
        System.out.println("v2 adding done");
    }

    public void remove(int index){
        System.out.println("entered remove by index "+index );

        if(index>=size){
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
        }

        if(size==1){
            head=null;

        }else{

            int counter=0;
            Node last = head;
            Node prev=null;
            while(last!=null){
                prev=last;
                System.out.println("prev: " +prev);
                last=last.next;
                System.out.println("new last: " +last);
                counter++;
                if(counter==index){
                    break;
                }
            }
            prev.next=last.next;
            last.next=null;}
        size--;

    }

    public String get(int index){
        System.out.println("entered get by index "+index );

         if(index>=size){
             throw new IndexOutOfBoundsException("IndexOutOfBoundsException");
         }

        int counter=0;
        Node last = head;
        while(last!=null){
            last=last.next;
            counter++;
            if(counter==index){
                break;
            }
        }
        return last.value;
    }

    public int size(){
        int size=0;
        Node last = head;
        while(last!=null){
            last=last.next;
            size++;
        }
        return size;
    }

    public int sizeV2(){
        return size;
    }

    @Override
    public String toString() {
        Node tmp_node=head ;
        while(tmp_node!= null){
            System.out.println(tmp_node);
            tmp_node = tmp_node.next;
        }
        return "";
    }
}
