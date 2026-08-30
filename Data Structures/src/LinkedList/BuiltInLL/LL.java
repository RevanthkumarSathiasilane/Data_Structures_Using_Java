package LinkedList.BuiltInLL;
import java.util.LinkedList;
public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        //list.addFirst(0);
        list.get(2);//in arraylist : O(1), LinkedList : O(n)
        System.out.println(

                list.peek());
        System.out.println(list);
    }
}
