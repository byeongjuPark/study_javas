import java.util.Scanner;
//refer : https://www.acmicpc.net/problem/1110
public class PlusCycles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, a, b;
        int sum = 0;
        int temp;
        int result = 0;
        int cycle = 0;
        x = sc.nextInt();
        temp = x;
          
        while(true){
            a = x / 10;
            b = x % 10;
            sum = a+b;
            result = (b *10) + (sum%10);
            x = result;  
            cycle++;
            if(result ==temp){
                System.out.println(cycle);
                break;
            }
        }

        sc.close();
    }
}
