package Step.Loop;
import java.util.Scanner;


// 문제
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

// 입력
// 입력은 여러 개의 테스트 케이스로 이루어져 있다.

// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//-> 예외 이용해서 루프문 탈출



public class APlusB2 {
    public static void main(String[] args) {

        //refer : https://www.acmicpc.net/problem/10951
        Scanner sc = new Scanner(System.in);
        int a, b;
        while(true){
            try{
                a = sc.nextInt();
                b = sc.nextInt();
                
                System.out.println(a+b);
            }catch(Exception e){
                //-> 예외 이용해서 루프문 탈출
                    break;
            }
           
        }
        sc.close();
    }
}
