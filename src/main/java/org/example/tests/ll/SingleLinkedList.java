package org.example.tests.ll;

public class SingleLinkedList {
  Node head;




  public void add(int value){
    Node newNode = new Node(value,null);
    if(head==null){
      head = newNode;
        System.out.println("head is null, create new head:"+head.value);
    } else {
      Node tmp = head;
      while(tmp.next!=null){
          tmp=tmp.next;
      }
      tmp.next=newNode;
        System.out.println("head is not null,created next node:"+tmp.next.value);
    }

  }

  public void remove(int index){
      int counter=0;
      Node temp=head;
      Node prev=null;
      while(temp!=null){
          prev=temp;
          temp=temp.next;
          counter++;
          if(counter==index){
             break;
          }
      }
      prev.next=temp.next;
      temp.next=null;
  }

  public int get(int index){
      int counter=0;
      Node temp=head;
      while(temp!=null){
          temp=temp.next;
          counter++;
          if(counter==index){
              break;
          }
      }
      return temp.value;
  }

    @Override
    public String toString() {
        Node tmp_node=head ;
        while(tmp_node!= null){
            System.out.println(tmp_node.value);
            tmp_node = tmp_node.next;
        }
        return "";
    }

}
