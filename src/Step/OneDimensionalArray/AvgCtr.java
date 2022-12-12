package Step.OneDimensionalArray;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
//refer : https://www.acmicpc.net/problem/1546
public class AvgCtr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double max = 0;
        double sum = 0;
        double avg = 0;
        List<Double> score = new LinkedList<>();
        for(int i= 0; i < count; i++){
            score.add(sc.nextDouble());
        }

        //최대값 추출
        for(int i= 0; i < count; i++){
            if(score.get(i)>max){
                max = score.get(i);
            }
        }

        //주작처리
        for(int i= 0; i < count; i++){
            score.set(i, score.get(i)/max*100);
        }
        

        //평균 계산
        for(int i= 0; i < count; i++){
            sum += score.get(i);
        }
        avg = sum / count;

        System.out.println(avg);
        sc.close();
    }
}
