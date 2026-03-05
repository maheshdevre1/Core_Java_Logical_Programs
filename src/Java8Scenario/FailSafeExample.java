package Java8Scenario;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
	public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Java");
        list.add("Python");

        for (String lang : list) {
            System.out.println(lang);
            list.add("C++"); // No ConcurrentModificationException
        }

        System.out.println("Final List: " + list);
    }

}
