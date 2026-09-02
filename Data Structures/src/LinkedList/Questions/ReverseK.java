package LinkedList.Questions;

public class ReverseK {
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
            current.next  = new Node(num);
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
    static Node reversekNodes(Node head,int k){
        Node current = head;
        Node prev = null;
        Node next = current.next;
        while(true){
            Node last = prev;
            Node newEnd = current;
            for(int i=0; current!=null && i<k ; i++){
                current.next = prev;
                prev = current;
                current = next;
                if(next!=null) next = next.next;
            }
            if(last!=null){
                last.next = prev;
            }
            else{
                head = prev;
            }
            newEnd.next = current;

            if(current == null) break;
            prev = newEnd;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{1,2,3,4,5,6,7});
        display(head);
        head = reversekNodes(head,3);
        display(head);
    }
}
