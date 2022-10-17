package Step.Conditional;
import java.util.Scanner;

// x좌표와 y좌표가 모두 양수 1
// x좌표가 음수 y좌표 양수 2
// x좌표와 y좌표가 모두 음수 3
// x좌표 양수, y좌표 음수 4

//refer : https://www.acmicpc.net/problem/14681
public class Quadrant{
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        if(x>0 && y>0){
            System.out.print(1);
        }else if(x<0 && y>0){
            System.out.print(2);
        }else if(x<0 && y<0){
            System.out.print(3);
        }else if(x>0 && y<0){
            System.out.print(4);
        }
        sc.close();
    }
}