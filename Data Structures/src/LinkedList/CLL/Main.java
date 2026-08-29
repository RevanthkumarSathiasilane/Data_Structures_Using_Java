package LinkedList.CLL;

public class Main {
    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.insert(17);
        cll.insert(23);
        cll.insert(24);
        cll.insert(35);
        cll.display();
        cll.delete(24);
        cll.display();
    }
}
