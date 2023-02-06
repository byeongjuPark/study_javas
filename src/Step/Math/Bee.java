package Step.Math;

import java.util.Scanner;

public class Bee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int range = 2;
        if(n == 1){
            System.out.println(1);
        }else{
            while(range <= n){
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
        
    }
}



// 
// 1 -> 1 
// 2 ~ 7 -> 2
// 8 ~ 19 -> 3
// 20 ~ 37 -> 4
// 38 ~ 61 -> 5

