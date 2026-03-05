package Java8Scenario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {
	public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add("C++"); // Structural modification during iteration
        }
    }

}
