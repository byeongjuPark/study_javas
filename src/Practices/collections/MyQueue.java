package Practices.collections;

import java.util.List;
import java.util.ArrayList;

public class MyQueue {
    private List<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data){
        arrayQueue.add(data);
    }

    public String deQueue(){
        int len = arrayQueue.size();
        if(len ==0){
            System.out.println("큐가 비었습니다.");
            return null;
        }

        return(arrayQueue.remove(0));
    }
}
