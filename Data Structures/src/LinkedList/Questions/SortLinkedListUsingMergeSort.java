package LinkedList.Questions;

public class SortLinkedListUsingMergeSort {
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
    static Node getMid(Node head){
       Node fast = head;
       Node slow = null;
       while(fast!=null && fast.next!=null){
           fast = fast.next.next;
           if(slow == null) slow = head;
           else slow = slow.next;
       }
       Node mid = slow.next;
       slow.next = null;
       return mid;
    }
    static Node sortList(Node head){
        if(head == null || head.next == null) return head;
        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);
        return mergeList(left,right);
    }
    static Node mergeList(Node l1, Node l2){
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
        if(l1!=null){
            current.next=l1;
        }
        else{
            current.next = l2;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{2,1,3,4,5});
        display(head);
        head=sortList(head);
        display(head);
    }
}
