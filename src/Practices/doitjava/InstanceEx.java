package Practices.doitjava;

public class InstanceEx {
    public static void main(String[] args) {
        Instance i = new Instance(3);
        Instance b = i;

        System.out.println("Instace I's a : " + i.getA());
        b.setA(5);
        System.out.println("After Instance I's a : " + i.getA());
    }
}
