package Practices.doitjava;

public class GenericOutputRun {
    public static void main(String[] args) {
        String a = "abc";
        int b = 5;
        GenericOutput genericOutput1 = new GenericOutput();
        GenericOutput genericOutput2 = new GenericOutput();

        genericOutput1.setResult(a);
        genericOutput2.setResult(b);

        System.out.println(genericOutput1.getResult());
        System.out.println(genericOutput2.getResult());
    }
}
