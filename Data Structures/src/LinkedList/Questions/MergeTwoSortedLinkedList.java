package LinkedList.Questions;

public class MergeTwoSortedLinkedList {
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
        for(int num : arr){
            current.next = new Node(num);
            current = current.next;
        }
        return dummy.next;
    }
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    static Node merge(Node l1,Node l2){
        Node dummy = new Node(-1);
        Node current = dummy;
        while(l1!=null && l2!=null){
            if(l1.value<=l2.value){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1!=null){
            current.next = l1;
        }else{
            current.next = l2;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        Node head1 = create(new int[]{1,2,3});
        display(head1);
        Node head2 = create(new int[]{2,3,4});
        display(head2);
        Node current = merge(head1,head2);
        display(current);
    }
}
