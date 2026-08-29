package LinkedList.DLL;

import javax.crypto.spec.PSource;

public class DLL {
    Node head;
    Node tail;
    int size;

    public DLL() {
        this.size = 0;
    }
    public class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }
    public void revDisplay(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            last = temp;
            temp = temp.next;
        }
        System.out.print("END -> ");
        while(last!=null){
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
    }
    public void insertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        node.prev = last;
        node.next = null;
        last.next = node;

    }
   public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
       System.out.println("END");
   }
}
