package Step.OneDimensionalArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMax {

    //refer : https://www.acmicpc.net/problem/10818
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max, n;
        List<Integer> list = new ArrayList<>();

        n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        min = list.get(0);
        max = list.get(0);
        for(int i=0; i<n; i++){
            if(list.get(i)<min){
                min = list.get(i);
            }
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.print(min + " " + max);
        sc.close();
    }
}
