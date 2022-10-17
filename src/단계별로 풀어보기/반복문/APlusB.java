import java.util.Scanner;


public class APlusB {
    public static void main(String[] args) {

        //refer : https://www.acmicpc.net/problem/10952
        Scanner sc = new Scanner(System.in);
        int a, b;
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a == 0 && b == 0){
                break;
            }
            System.out.println(a+b);
        }
        sc.close();
    }
}
