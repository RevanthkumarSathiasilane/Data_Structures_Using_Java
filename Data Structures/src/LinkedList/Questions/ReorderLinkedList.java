package LinkedList.Questions;

public class ReorderLinkedList {
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
    static Node middleNode(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    static Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = current.next;
        while(current!=null){
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }
    static Node reorder(Node h1,Node h2){
        Node dummy = new Node(-1);
        Node current = dummy;
        while(h1!= null && h2!=null){
            Node next1 = h1.next;
            Node next2 = h2.next;

            current.next = h1;
            current = current.next;
            current.next = h2;
            current = current.next;

            h1 = next1;
            h2 = next2;
        }
        current.next = h1;
        return dummy.next;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{1,2,3,4,5,6,7});
        display(head);
        Node mid = middleNode(head);
        Node reverseHead = reverse(mid.next);
        mid.next = null;
        Node result = reorder(head,reverseHead);
        display(result);
    }
}
