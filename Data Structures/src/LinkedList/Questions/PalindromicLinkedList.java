package LinkedList.Questions;

public class PalindromicLinkedList {
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
    static Node reverse(Node mid){
        Node prev = null;
        Node current = mid;
        while(current!=null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
      return prev;
    }
    static boolean checkPalindrome(Node h1,Node h2){
        if(h1 == null || h1.next==null) return true;
        while(h2!=null){
            if(h1.value!=h2.value) return false;
            h1 = h1.next;
            h2 = h2.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{1,2,2,1});
        display(head);
        Node mid = middleNode(head);
        Node reverseHead = reverse(mid.next);
        System.out.println(checkPalindrome(head,reverseHead));
    }
}
