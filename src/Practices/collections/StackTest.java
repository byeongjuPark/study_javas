package Practices.collections;

import java.util.ArrayList;
import java.util.List;

public class StackTest {
    private List<String> arrayStack = new ArrayList<>();

    public void push(String data){
        arrayStack.add(data);
    }

    public String pop(){
        int len = arrayStack.size();
        if(len==0){
            System.out.println("스택이 비어있습니다.");
            return null;
        }

        return(arrayStack.remove(len-1));
    }

    public static void main(String[] args) {
        StackTest stack = new StackTest();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        for(String str :stack.arrayStack ){
            System.out.println(str);
        }
    }
}
