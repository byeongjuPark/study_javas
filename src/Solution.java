import java.util.ArrayList;
import java.util.List;


class Solution {
    public static void main(String[] args) {
            String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
            solution(quiz);
    }
    
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        List<String> resultArr = new ArrayList<>();
        for(int i=0;i<quiz.length;i++){
            String[] str = quiz[i].split(" ");
            System.out.println(str);
            if(str[1].equals("-")){
                boolean isTrue = (Integer.parseInt(str[0]) - Integer.parseInt(str[2])) == Integer.parseInt(str[4]);
                if(isTrue){
                    resultArr.add("O");
                }else{
                    resultArr.add("X");
                }
            }else{
                boolean isTrue = (Integer.parseInt(str[0]) + Integer.parseInt(str[2])) == Integer.parseInt(str[4]);
                if(isTrue){
                    resultArr.add("O");
                }else{
                    resultArr.add("X");
                }
            }
        }
        for(int i = 0;i<quiz.length;i++ ){
            answer[i] = resultArr.get(i);
        }
        return answer;
    }
}