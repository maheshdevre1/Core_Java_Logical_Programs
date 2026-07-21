package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Wissen {
	public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        System.out.println(al);

        Iterator<Integer> itr = al.iterator();

        while (itr.hasNext()) {

            if (itr.next() == 3) {

                al.remove(3);
            }
        }

        System.out.println(al);
    }

}
