package Practices.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReduceTest {
    public static void main(String[] args) {
        // String[] greetings = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
        // System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)->{
        //     if(s1.getBytes().length >= s2.getBytes().length) return s1;
        //     else return s2; 
        // }));
        // int[] numbers = {1, 3, 5, 8, 10, 13};
        // int sum = Arrays.stream(numbers).reduce((x,y) -> x + y).orElse(0);
        // int max = Arrays.stream(numbers).reduce((x,y)->{
        //     if(x > y) return x;
        //     else return y;
        // }).orElse(0);

        // System.out.println("sum : "+sum);
        // System.out.println("max : "+max);
        
        // String before = "apple";
        // String after = "elppa";

        // int answer = 0;
        // String[] strArr = before.split("");
        // List<String> list = Arrays.stream(strArr).toList();
        // Collections.reverse(list);
        // strArr = (String[]) list.stream().toArray();
        // String str = String.join("", strArr);
        // if(str.equals(after)){
        //     answer = 1;
        // }
        // int[] array = {1, 3, 5};
        // int[] answers = {0,0};
        // answers[0] = Arrays.stream(array).reduce((x,y)->{
        //     if(x > y) return x;
        //     else return y;
        // }).orElse(0);
        // answers[1] = Arrays.stream(array).reduce((x,y) -> {
        //     if(x < y) return x;
        //     else return y;
        // }).orElse(0);
        int[] array = {1,3,4,6,7, 5};
        
        int max = 0; 
        int index =0;
        
        for(int i = 0 ; i<array.length ; i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        System.out.println("zz");
        int[] answer = {max, index};
    }
}
