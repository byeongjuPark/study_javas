package Step.OneDimensionalArray;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//refer : https://www.acmicpc.net/problem/10807
public class HowManyV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new LinkedList<>();
        int count =0;
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        int v = sc.nextInt();

        //v와 같은 수 찾기
        for(int i=0; i<n; i++){
            if(list.get(i)==v){
                count++;
            }
        }
        System.out.println(count);

        sc.close();
    }
}
