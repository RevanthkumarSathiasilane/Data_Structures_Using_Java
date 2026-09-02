package LinkedList.Questions;

public class RotateRightInLinkedList {
    static class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    static Node create(int[] arr){
         Node dummy = new Node(-1);
         Node current = dummy;
         for(int num:arr){
             current.next = new Node(num);
             current = current.next;
         }
         return dummy.next;
    }
    static void display(Node head){
        while(head!=null){
            System.out.print(head.value+" -> ");
            head = head.next;
        }
        System.out.println("END");
    }
    static Node rotation(Node head,int k,int l){
        int rotations = k%l;
        int skip = l-rotations;
        Node newLast = head;
        for(int i=0;i<skip-1;i++){
            newLast = newLast.next;
        }
        head =  newLast.next;
        newLast.next = null;
        return head;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{1,2,3,4,5});
        display(head);
        int length = 1;
        Node last = head;
        while(last.next!=null){
            last = last.next;
            length++;
        }
        last.next = head;
        head = rotation(head,2,length);
        display(head);
    }
}
