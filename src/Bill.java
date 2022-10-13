import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {

        //refer : https://www.acmicpc.net/problem/25304
        Scanner sc = new Scanner(System.in);
        int totalPrice, n;
        int sum = 0;
        int a[] = new int[100];
        int b[] = new int[100];

        totalPrice = sc.nextInt();
        n = sc.nextInt();

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            sum +=(a[i]*b[i]);
        }
        if(totalPrice == sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
