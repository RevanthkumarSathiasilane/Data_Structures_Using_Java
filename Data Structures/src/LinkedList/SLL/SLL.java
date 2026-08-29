package LinkedList.SLL;

public class SLL {
    private Node head;
    private Node tail;
    private int size;
    public SLL(){
        this.size = 0;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null) tail = node;
        size++;
    }
    public void insertLast(int val){
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        node.next = null;
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertAtParticular(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        if(head == null){
            tail=null;
            return 0;
        }
        int val = head.value;
        head = head.next;
        if(head == null){
            tail=null;
        }
        size--;
        return val;
    }
    public Node get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    public int deleteLast(){
        if(size<=1){
           return deleteFirst();
        }
        Node sLast = get(size-2);
        int val = sLast.next.value;
        sLast.next = null;
        tail = sLast;
        size--;
        return val;
    }
    public int deleteAtParticular(int index){
        if(index == 0) return deleteFirst();
        if(index == size-1) return deleteLast();
        Node prev =get(index-1);
        int val=prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }
    public int find(int val){
        Node temp = head;
        int index = 0;
        while(temp!=null){
            if(val == temp.value){
                return index;
            }
            index += 1;
            temp = temp.next;
        }
        return -1;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void revDisplay(){
        if(size<2) return;
        Node prev = null;
        Node current = head;
        Node front = head.next;
        while(current!=null){
            current.next = prev;
            prev = current;
            current = front;
            if(front!=null){
                front = front.next;
            }
        }
        head = prev;
        display();
    }
    public void reverse(){
        Node node = head;
        helper(node);
        display();
    }
    public void helper(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        helper(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
}
