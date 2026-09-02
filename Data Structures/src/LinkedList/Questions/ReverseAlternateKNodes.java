package LinkedList.Questions;

public class ReverseAlternateKNodes {
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
    static Node reverseAlternateK(Node head,int k){
        Node current = head;
        Node prev = null;
        Node next = current.next;
        int count = 0;
        while(current!=null && count<k){
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null) next = next.next;
            count++;
        }
        head.next = current;
        Node temp = current;
        count = 0;
        while(temp!=null && count<k-1){
            temp = temp.next;
            count++;
        }
        if(temp!=null){
            temp.next = reverseAlternateK(temp.next,k);
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{1,2,3,4,5,6,7,8,9});
        display(head);
        head = reverseAlternateK(head,3);
        display(head);
    }
}
