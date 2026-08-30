package LinkedList.Questions;

public class RecursiveInsertion {
    static class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
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
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    static Node recursiveInsertion(Node node,int index,int value){
        //edge case:
        if(node == null) return null;
        if(index == 0){
            Node temp = new Node(value);
            temp.next = node;
            return temp;
        }
        node.next = recursiveInsertion(node.next,index-1,value);
        return node;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{23,22,21,20,18});
        display(head);
        head = recursiveInsertion(head,4,19);
        display(head);
    }
}
