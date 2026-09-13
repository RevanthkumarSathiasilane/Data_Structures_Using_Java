package Sorting.Questions;
import java.util.*;
public class FindTheDuplicateNumberUsingCyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3};
        System.out.println(cyclicSort(arr));
    }
    static int cyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
//        for(int c=0;c<arr.length;c++){
//            if(arr[c]!=c+1){
//                return arr[c];
//            }
//        }
        return arr[arr.length-1];
    }
    static void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
