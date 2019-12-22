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
		  
		   public void testAdd(){
		      int student = 0;
			double result = student + student;
		      assertTrue(result == 6);

		   }
	}
}
