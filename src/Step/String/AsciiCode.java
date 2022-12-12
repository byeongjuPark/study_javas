package Step.String;

import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = (int)a.charAt(0);
        System.out.println(b);
        sc.close();
    }
}
