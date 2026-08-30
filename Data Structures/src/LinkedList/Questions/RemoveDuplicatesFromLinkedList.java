package LinkedList.Questions;

public class RemoveDuplicatesFromLinkedList {
    static class Node{
        int value ;
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
    static Node removeDuplicates(Node head){
        Node node = head;
        if(node == null) return null;
        while(node.next!=null){
            if(node.value == node.next.value){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = create(new int[]{1,1,1,2,3,3,4});
        display(head);
        head = removeDuplicates(head);
        display(head);
    }
}
