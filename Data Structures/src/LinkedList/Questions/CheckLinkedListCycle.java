package LinkedList.Questions;

import java.security.spec.RSAOtherPrimeInfo;

public class CheckLinkedListCycle {
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
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    static void changeCyclic(Node head,int pos){
        int index = 0;
        Node cycleNode = null;
        Node current = head;
        while(current.next!=null){
            if(index == pos){
                cycleNode = current;
            }
            index+=1;
            current = current.next;
        }
        current.next = cycleNode;
    }
    static boolean hadCycle(Node head){
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{3,2,0,4});
        display(head);
        changeCyclic(head,1);
        System.out.println(hadCycle(head));
    }
}
