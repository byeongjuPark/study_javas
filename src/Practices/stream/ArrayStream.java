package Practices.stream;

import java.util.Arrays;
import java.util.*;

public class ArrayStream {
    public static void main(String[] args) {
        String my_string ="banana";
        String answer = new StringBuilder(my_string).reverse().toString();
        int a[] = {1,2,3,4};
        
        System.out.println(Arrays.stream(a).average().orElse(1));
    }
}
 