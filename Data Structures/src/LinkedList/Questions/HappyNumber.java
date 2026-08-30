package LinkedList.Questions;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
    }
    static boolean isHappyNumber(int n){
        int fast = n;
        int slow = n;
        do{
            fast = sum(sum(fast));
            slow = sum(slow);
        }while(fast!=slow);
        if(fast == 1) return true;
        return false;
    }
    static int sum(int n){
        int ans = 0;
        while(n!=0){
            int rem = n%10;
            ans+=rem*rem;
            n/=10;
        }
        return ans;
    }

}
