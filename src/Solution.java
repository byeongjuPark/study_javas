import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        long a = solution(3, 20, 4);
        System.out.println(a);
        int[] numbers = {3,4,5,7};
        Arrays.sort(numbers);
        System.out.println(numbers.toString());
    }

    public static long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;
        for(int i = 0 ; i < count ; i++){
            sum = sum + (price * (i+1));
        }
        
        if(money >= sum){
            answer = 0;
        }else {
            answer = sum - money;
        }

        return answer;
    }
}