package LinkedList.Questions;

public class ReverseLeftToRight {
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
    static Node reverse(Node head,int left,int right){
        if(left >= right){
            return head;
    }
        //skip:
        Node prev = null;
        Node current = head;
        for(int i=0;current!=null && i<left-1;i++){
            prev = current;
            current = current.next;
        }
        // note : newEnd and last
         Node last = prev;
        Node newEnd = current;
        Node next = current.next;
        for(int i=0;current!=null && i<right-left+1;i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next = next.next;
            }
        }
        if(last!=null){
            last.next = prev;
        }else{
            head.next = prev;
        }
        newEnd.next = current;
        return head;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{1,2,3,4,5});
        display(head);
        head=reverse(head,2,1);
        display(head);
    }
}
