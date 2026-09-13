package Sorting.Questions;
import java.util.*;
public class FirstMissingPositive {
    public static void main(String[] args) {
       int[] arr = {1,2,0};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(  i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int c=0;c<arr.length;c++){
            if(arr[c]-1 != c){
                return c+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
