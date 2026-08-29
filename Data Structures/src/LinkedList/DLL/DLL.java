package LinkedList.DLL;

public class DLL {
    Node head;
    Node tail;
    int size;

    public DLL() {
        this.size = 0;
    }
    public class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
