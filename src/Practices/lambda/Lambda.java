package Practices.lambda;

import java.util.Arrays;
public class Lambda {
    public static void main(String[] args) {
        int number = 10;
        Runnable runnable = () -> System.out.println(number);
        runnable.run();
    }


class Solution {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i*2).toArray();
    }
    public String solution(String my_string) {
        String answer = "";
        String strArr[] = my_string.split("");
        for(String str : strArr){
            if((int)str.charAt(0)<97){
                answer+=(char)((int)str.charAt(0) + 32);
            }
        }
        return answer;
    }
}
}

