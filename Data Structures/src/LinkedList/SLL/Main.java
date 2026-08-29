package LinkedList.SLL;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL sll = new SLL();
        sll.insertFirst(23);
        sll.insertFirst(18);
        sll.insertLast(25);
        sll.insertAtParticular(19,1);
        sll.insertLast(30);
        sll.insertLast(40);
        sll.deleteFirst();
        sll.deleteLast();
        sll.deleteAtParticular(2);
        sll.display();
        //LinSearch in Singly Linked List:
        int val = sc.nextInt();
        if(sll.find(val) >=0) System.out.println("The value ( "+val+" ) found at index :"+sll.find(val));
        else System.out.println("Not found");
        sll.revDisplay();
        sll.reverse();
    }
}
