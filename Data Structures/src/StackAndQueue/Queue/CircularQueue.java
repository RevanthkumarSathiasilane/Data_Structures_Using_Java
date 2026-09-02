package StackAndQueue.Queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;// because end cannot be used for checking full and empty.

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return data.length == size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean insert(int item){
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end%data.length;//important line;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[front++];
        front= front%data.length;//why front -> because, front also can reach out of size;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }
    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int i = front;
        do{
            System.out.print(data[i]+" -> ");
            i++;
            i%=data.length;
        }while(i!=end);
        System.out.println("END");
    }
}
