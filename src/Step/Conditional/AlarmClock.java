package Step.Conditional;
import java.util.Scanner;
//refer : https://www.acmicpc.net/problem/2884
public class AlarmClock{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m;
        h = sc.nextInt();
        m = sc.nextInt();
        if(0>(m-45)){ // 분이 0밑으로..
            if(h==0){
                h=23;
            }else{
                h--;
            }

            m=60-(45-m);
        }else{
            m-=45;
        }
        System.out.print(h + " "+ m);
        sc.close();
    }
}