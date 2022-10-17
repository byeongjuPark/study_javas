package Step.Conditional;
import java.util.Scanner;

public class ThreeDice {
    public static void main(String[] args) {
        //refer : https://www.acmicpc.net/problem/2480

        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int temp = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
        // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
        // 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
        if(a == b && b == c){
            System.out.println(10000+(a*1000));
        }else if(a == b){
            System.out.println(1000+(a*100));
        }else if(a == c){
            System.out.println(1000+(a*100));
        }else if(b == c){
            System.out.println(1000+(b*100));
        }else{
            temp = a;
            if(temp<b){
                temp = b;
            }
            if(temp<c){
                temp = c;
            }
            System.out.println(temp * 100);
        }
       
        sc.close();
    }
}
