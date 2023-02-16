package Practices.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        // List<Customer> customers = new ArrayList<>();
        // customers.add(new Customer("Kim", 33));
        // customers.add(new Customer("Park", 45));
        // customers.add(new Customer("Sim", 27));
        // customers.add(new Customer("Ahn", 34));
        // customers.add(new Customer("Kim", 33)); // 중복 데이터
        // Stream<Customer> stream = customers.stream();
        // stream.filter(customer -> customer.getAge() > 30).sorted().forEach(System.out::println);
        // System.out.println("---------------------------");
        // stream = customers.stream();
        // stream.sorted(Comparator.comparing(Customer::getName)).forEach(System.out::println);
        // stream = customers.stream();

        // int i[] = solution("a5132f");
        // for (int a : i) {
        //     System.out.println(a);
        // }
        // privateSecret("aukks", "wbqd", 5);
        // int i[] = {4,455,6,4,-1,45,6};
        // rightLeft(i, "left");
        // long sqrt = (long) Math.sqrt(144);
        // System.out.println(sqrt);
        // String[] seoul = {"Jane","Kim"};
        // System.out.println(solution(seoul));
        String[] menu = {"양념", "간장"};
        Scanner sc = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요 :");
        String choice = sc.nextLine();
        Arrays.asList(menu).stream().filter(str -> str.equals(choice)).
        // sc.close();
    }

    public static String solution(String[] seoul) {
        String answer = "";
        int index = 0;
        for(String str : seoul){
            
            if(str.equals("Kim")){
                answer = "김서방은 "+index+"에 있다";
                break; // 성능
            }
            index++;
        }
        return answer;
    }
    // public static int[] solution(long n) {
    //     return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    // }
    // public static int[] solution(long n) {
    //     String str = new StringBuilder(String.valueOf(n)).reverse().toString();
    //     String[] strArr = str.split("");
    //     int[] answer = new int[strArr.length];
    //     for(int i = 0 ; i<answer.length; i++){
    //         answer[i] = Integer.parseInt(strArr[i]);
    //     }
        
        
    //     return answer;
    // }

    public static int[] solution(String my_string) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        String strArr[] = my_string.replaceAll("[a-zA-z]", "").split("");
        for (String str : strArr) {
            list.add(Integer.parseInt(str));
        }
        answer = list.stream().mapToInt(i -> i).sorted().toArray();
        return answer;
    }

    public int[] usingmapToInt(String myString) { // string 배열을 int 배열로~
        return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt)
                .toArray();
    }

    public static String privateSecret(String s, String skip, int index) {
        String answer = "";
        String pool = "abcdefghijklmnopqrstuvwxyz";
        String pools = pool.replaceAll("[" + skip + "]", "");
        String poolArr[] = pools.split("");
        String sArr[] = s.split("");

        for(int i=0; i<sArr.length; i++){
            //sArr[i]의 값을 poolArr에서 찾아서 인덱스 +5 해준다.
            for(int k = 0; k < poolArr.length-index; k++){
                
                if(sArr[i].equals(poolArr[k])){
                    answer+=poolArr[k+index];
                }
                // else if(!sArr[i].equals(poolArr[k])){
                //     answer+=sArr[i];
                // }
            }
        }
        return answer;
    }
    public static int[] rightLeft(int[] numbers, String direction) {
        int[] numbersTemp = numbers.clone();
        int temp;
        switch(direction){
            case "right":
            temp = numbers[numbers.length-1];
            for(int i = 1; i<numbers.length; i++){
                numbersTemp[i] = numbers[i-1];
            }
            numbersTemp[0] = temp;
            break;
            case "left" :
            temp = numbers[0];
            for(int i = 0; i<numbers.length-1; i++){
                numbersTemp[i] = numbers[i+1];
            }
            numbersTemp[numbers.length-1] = temp;
            break;            
        }
        
        return numbersTemp;
    }
}
