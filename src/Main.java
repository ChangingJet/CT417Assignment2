import junit.framework.*;

public class Main {
	
	public static void main(String args[]){  
		
		String student = studentClass.Student(args);
		String module = moduleClass.Module(args);
		String programme = programmeClass.Programme(args);
		System.out.println("Student: "+student);
		System.out.println("Module: "+module);
		System.out.println("Programme: "+programme);
	}
	
	public class JavaTest extends TestCase {
		   protected int value1, value2;
		   
		   // assigning the values
		   protected void setUp(){
		      value1 = 3;
		      value2 = 3;
		   }

		   // test method to add two values
		   public void testAdd(){
		      double result = value1 + value2;
		      assertTrue(result == 6);

		   }
	}
}
