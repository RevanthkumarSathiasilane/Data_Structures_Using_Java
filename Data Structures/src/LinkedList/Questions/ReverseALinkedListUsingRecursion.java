package LinkedList.Questions;

public class ReverseALinkedListUsingRecursion {
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
    static Node reverseLL(Node node){
        if(node.next == null){
            return node;
        }
        Node newHead = reverseLL(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        Node head = create(new int[]{5,4,3,2,1});
        display(head);
        head = reverseLL(head);
        display(head);
    }
}
