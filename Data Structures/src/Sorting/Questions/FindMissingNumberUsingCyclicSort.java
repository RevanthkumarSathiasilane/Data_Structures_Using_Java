package Sorting.Questions;

public class FindMissingNumberUsingCyclicSort {
    public static void main(String[] args) {
        int[] arr = {0,2,1};
        int i = cyclicSort(arr);
        System.out.println(i);
    }
    static int cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int c=0;c<arr.length;c++){
            if(c != arr[c]){
                return c;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
