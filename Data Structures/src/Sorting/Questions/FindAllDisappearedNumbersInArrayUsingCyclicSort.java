package Sorting.Questions;
import java.util.*;
public class FindAllDisappearedNumbersInArrayUsingCyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> list = cyclicSort(arr);
        System.out.println(list);
    }
    static ArrayList<Integer> cyclicSort(int[] arr){
        ArrayList<Integer> list  = new ArrayList<>();
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for(int c = 0;c<arr.length;c++){
             if(arr[c]-1 != c){
                list.add(c+1);
            }
        }
        return list;
    }
    static void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
