package StackAndQueue.Questions;
import java.util.*;
public class MinAddToMakeValid {
    public static void main(String[] args) {

    }
    public int minAddToMakeValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
