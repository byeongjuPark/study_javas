package Practices.stream;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Kim", 33));
        customers.add(new Customer("Park", 45));
        customers.add(new Customer("Sim", 27));
        customers.add(new Customer("Ahn", 34));
        customers.add(new Customer("Kim", 33)); // 중복 데이터
        Stream<Customer> stream = customers.stream();
        stream.filter(customer -> customer.getAge() > 30).sorted().forEach(System.out::println);
        System.out.println("---------------------------");
        stream = customers.stream();
        stream.sorted(Comparator.comparing(Customer::getName)).forEach(System.out::println);
    }
    
}
