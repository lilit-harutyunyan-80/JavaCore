package collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class CollectionExample2 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();


        names.add("Mane");
        names.add("Anna");
        names.add("Ara");
        names.add("Mark");
        names.add("Gor");


        for (String name : names) {
            System.out.println(name);
        }

        ArrayList<String> names1 = new ArrayList<>();
        System.out.println();
        names1.add("Karo");
        names1.add("Vardan");
        names1.add("Ara");
        names1.add("Gor");
        names1.add("Mane");
        names1.add("Davit");
        names1.add("Sevak");
        names1.add("Tatev");
        names1.add("Hovhannes");
        names1.add("Nvard");


        Collections.sort(names1);


        for (String name : names1) {
            System.out.println(name);
        }

    }
}



