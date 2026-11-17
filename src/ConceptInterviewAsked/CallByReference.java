package ConceptInterviewAsked;
class Student1 {
    String name = "Rahul";
}

public class CallByReference {
	public static void main(String[] args) {
        Student1 s1 = new Student1();

        System.out.println("Before: " + s1.name);

        change(s1);

        System.out.println("After : " + s1.name);
	}

	private static void change(Student1 s1) {
		s1.name = "Mahesh";
		
	}

}
