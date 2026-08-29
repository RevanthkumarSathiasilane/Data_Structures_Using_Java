package LinkedList.CLL;

public class CLL {
    ListNode head;
    ListNode tail;
    int size;

    public CLL() {
        this.size = 0;
    }

    public class ListNode{
     int value;
     ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
    public void insert(int val){
        ListNode node = new ListNode(val);
        if(head==null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        if(head == tail) {
            head.next = node;
            tail = node;
            tail.next = head;
            size++;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }
    public void delete(int val){
        ListNode node = head;
        if(node == null){
            System.out.print("Create your Circular Linked List");
            return;
        }
        if(node.value == val){
            head = node.next;
            tail.next = head;
            size--;
            return;
        }
        do{
            ListNode n = node.next;
            if(n.value == val){
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }while(node!=head);
    }
    public void display(){
        ListNode node = head;
        if(head==null){
            return;
        }else{
            do{
                System.out.print(node.value+" -> ");
                if (node.next != null) {
                    node = node.next;
                }
            }while(node!=head);
            System.out.println("HEAD");
        }
    }
}
