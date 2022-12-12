package Step.OneDimensionalArray;

import java.util.Scanner;

//refer : https://www.acmicpc.net/problem/4344

public class UpAvg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<n;i++){
            int arr[] = new int[sc.nextInt()];
            int sum=0;
            int avg;
            for(int j = 0; j<arr.length; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            //평균
            avg = sum / arr.length;
            System.out.println(avg);
            //백분율 구하기
            //
        }
        sc.close();
    }
    

    

    

}
