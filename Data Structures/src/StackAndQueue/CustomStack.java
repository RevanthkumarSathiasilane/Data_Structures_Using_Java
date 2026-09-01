package StackAndQueue;

public class CustomStack {
  protected int[] data;
  private static final int DEFAULT_SIZE = 10;
  static int ptr = -1;
    public CustomStack() {
       // this.data = new int[DEFAULT_SIZE];
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int data){
        if(isFull()){
            System.out.println("Stack us full");
            return false;
        }
        ptr++;
        this.data[ptr] = data;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack!!");
        }
//        int val = data[ptr--];
//        return val;
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot find peek from an empty stack!!");
        }
        return data[ptr];
    }
    private boolean isFull(){
        return ptr == data.length-1;//ptr is at last index
    }

    private boolean isEmpty(){
        return ptr == -1;
    }

}
