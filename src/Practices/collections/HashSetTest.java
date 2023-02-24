package Practices.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("bottle");
        hashSet.add("park");
        hashSet.add("is here");

        Iterator<String> ir = hashSet.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }
    }
}
