package Step.Math;

import java.util.Scanner;

public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count =1;
        if(b >= c){
            System.out.println(-1);
        }else{
            System.out.println((a/(c-b))+1);
            // 시간 초과...!
            // while(true){
            //     count++;
            //     if((a+(b*count))<(c*count)){
            //         System.out.println(count);
            //         break; 
            //     }
            // } 
        }
    }
}
