package Practices.stream;

public class Customer implements Comparable<Customer>{
    String name;
    int age;
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Customer [name=" + name + ", age=" + age + "]";
    }
    
    @Override
    public int compareTo(Customer customer) {
        if(this.age > customer.getAge()){
            return 1;
        }else if(this.age == customer.getAge()){
            return 0;
        }else {
            return -1;
        }
    }
    
    
}
