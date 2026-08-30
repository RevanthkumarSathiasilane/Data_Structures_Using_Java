package LinkedList.Questions;

public class LengthOfALinkedListCycle {
    static class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    static Node create(int[] arr){
        Node dummy =  new Node(-1);
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
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    static void convertTocycle(Node head,int pos){
        int index = 0;
        Node current = head;
        Node cycleNode = null;
        while(current.next!=null){
            if(pos == index){
                cycleNode = current;
            }
            current = current.next;
            index+=1;
        }
        current.next = cycleNode;
    }
    static int lengthOfCycle(Node head){
        int length = 0;
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                Node temp = slow;
                do{
                    length+=1;
                    temp = temp.next;
                }while(temp!=slow);
                return length;
            }
        }
        return length;
    }
    public static void main(String[] args) {
         Node head = create(new int[]{1,2,3,4,5,6,7,8});
         display(head);
         convertTocycle(head,3);
        System.out.println("Length of Cyclic Node : "+ lengthOfCycle(head));
    }
}
