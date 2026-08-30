package LinkedList.Questions;

public class StartNodeInCyclicLinkedList {
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
            current=current.next;
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
    static void convertToCycle(Node head,int pos){
        Node temp = head;
        int index = 0;
        Node cycleNode = null;
        while(temp.next!=null){
            if(pos == index){
                cycleNode = temp;
            }
            index++;
            temp = temp.next;
        }
        temp.next = cycleNode;
    }
    static int lengthOfCycle(Node head){
        int length = 0;
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                Node temp = slow;
                do{
                    length++;
                    temp = temp.next;
                }while(temp!=slow);
                return length;
            }
        }
        return length;
    }
    static int searchStartCycle(Node head,int length){
        Node fast = head;
        Node slow = head;
        if(length == 0) return 0;
        for(int i=0;i<length;i++){
            slow = slow.next;
        }
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast.value;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{1,2,3,4,5,6,7,8});
        display(head);
        convertToCycle(head,3);
        int length = lengthOfCycle(head);
        System.out.println("Cycle starts at: "+searchStartCycle(head, length));

    }
}
