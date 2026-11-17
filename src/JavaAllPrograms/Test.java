package JavaAllPrograms;


public class Test {
	
   private static  Test instance;
   
   private Test() {}
   
   public static Test getinstance() {
	   if(instance == null) {
		   instance = new Test();
	   }
	   
	return instance;
	   
   }
	
	public static void main(String[] args) {
		Test t1  = Test.getinstance();
		Test t2  = Test.getinstance();
		System.out.println(t1 == t2);
		
		

	}
	
	
}
