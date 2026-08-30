package LinkedList.Questions;

public class LinkedListPractice {
    static class Node{
            int value;
            Node next;
            Node(int value){
                this.value = value;
            }
    }
    static Node create(int[] arr){
        Node dummy = new Node(-1);
        Node current = dummy;
        for(int num : arr){
            current.next = new Node(num);
            current = current.next;
        }
        return dummy.next;
    }
    static void display(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.value+" -> ");
            curr = curr.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        Node head = create(new int[]{1,2,3,4,5});
        System.out.println("Before:");
        display(head);
    }
}
