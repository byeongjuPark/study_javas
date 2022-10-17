package Step.OneDimensionalArray;

import java.util.Scanner;

//refer : https://www.acmicpc.net/problem/2562
public class maxCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        int temp;

        for(int i = 0 ; i<a.length ; i++){
            a[i] = sc.nextInt();
        }
        temp = 0;
        for(int i = 0; i<a.length ; i++){
            if(a[i]>temp){
                temp = a[i];
            } 
        }
        for(int i = 0; i<a.length; i++){
            if(a[i]==temp){
                System.out.println(temp);
                System.out.println(i + 1);
            }
        }
        sc.close();
    }
}
