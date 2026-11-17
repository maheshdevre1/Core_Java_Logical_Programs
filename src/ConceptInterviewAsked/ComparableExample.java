package ConceptInterviewAsked;

import java.util.*;


class Student implements Comparable<Student> {

    int age;

    Student(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        return this.age - s.age;
    }
}

public class ComparableExample {
	
	public static void main(String[] args) {
		 List<Student> list = new ArrayList<>();

	        list.add(new Student(25));
	        list.add(new Student(20));
	        list.add(new Student(30));

	        Collections.sort(list);

	        for (Student s : list) {
	            System.out.println(s.age);
	        }
		
	}

}
