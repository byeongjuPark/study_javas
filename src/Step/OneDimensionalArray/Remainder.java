package Step.OneDimensionalArray;
import java.util.HashSet;
import java.util.Scanner;
//refer : https://www.acmicpc.net/problem/3052
// memo : hashset은 중복이 자동으로 제거된다...&순서 개념이 없다.
public class Remainder{
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0 ; i < 10 ; i++){
            hash.add(sc.nextInt() % 42);
        }
        System.out.println(hash.size());
        sc.close();
    }
}