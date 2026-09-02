package StackAndQueue.Queue;

public class CustomQueue {
    int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public boolean isFull(){
        return data.length == end;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean insert(int item){
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];
        //shift the element left wards:
        for(int i=1;i<end;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" <- ");
        }
        System.out.println("END");
    }
}
