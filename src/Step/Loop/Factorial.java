package Step.Loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for(int i= n; i>0;i--){
            result *=i;
            //n * n-1 n * n-2
        }
        System.out.println(result);
    }
}
