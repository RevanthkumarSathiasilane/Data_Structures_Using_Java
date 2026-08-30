package LinkedList.Questions;

public class InPlaceReversalLinkedList {
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
            System.out.print(head.value +" -> ");
            head = head.next;
        }
        System.out.println("END");
    }
    static Node reverse(Node head){
        Node prev  = null;
        Node present = head;
        Node next = present.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next = next.next;
            }
        }
        head = prev;
        return head;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{5,4,3,2,1});
        display(head);
        head = reverse(head);
        display(head);
    }
}
