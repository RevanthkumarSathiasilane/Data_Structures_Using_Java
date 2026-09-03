package StackAndQueue.Questions;
import java.util.*;
public class ImplementQueueUsingStacks {
    public static void main(String[] args) {

    }
}
class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }
    public int remove() throws Exception{
        return first.pop();
    }
    public void insert(int item){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }
    /*
    Insertion = O(1);
    Removal = O(n);
    public void insert(int item){
        first.push(item);
    }
    public int remove() throws Exception{
        while(!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    */

    public int peek() throws Exception{
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peak = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peak;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
}