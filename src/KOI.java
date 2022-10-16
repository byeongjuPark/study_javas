import java.util.Scanner;
//refer : https://www.acmicpc.net/problem/2525
public class KOI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h, m, time;
        h = sc.nextInt();
        m = sc.nextInt();
        time = sc.nextInt();
        m = m+time;
        while(m>59){
            m-=60;
            h++;
            if(h>23){
                h=0;
            }
        }
        System.out.println(h + " " + m);
      sc.close();

    }
}
