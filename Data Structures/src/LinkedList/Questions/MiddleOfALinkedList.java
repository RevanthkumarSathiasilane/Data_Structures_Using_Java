package LinkedList.Questions;

public class MiddleOfALinkedList {
    static class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    static Node create(int[] arr){
        Node dummy =new Node(-1);
        Node current = dummy;
        for(int num:arr){
            current.next = new Node(num);
            current = current.next;
        }
        return dummy.next;
    }
    static int middleNode(Node head){
        Node fast = head;
       Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.value;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{10,20,40,50});
        System.out.println("Middle Node: "+middleNode(head));
    }
}
