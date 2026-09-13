package Sorting.Questions;
import java.util.*;
public class SetMismatchUsingCyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int c=0;c<nums.length;c++){
            if(nums[c]-1 != c){
                arr[0] = nums[c];
                arr[1] = c+1;
            }
        }
        return arr;
    }
    static void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
