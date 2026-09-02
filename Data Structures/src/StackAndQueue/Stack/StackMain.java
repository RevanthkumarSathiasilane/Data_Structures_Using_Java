package StackAndQueue.Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.push(35);
        stack.push(40);
        stack.push(45);
        stack.push(50);
        stack.push(55);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());


    }
}
