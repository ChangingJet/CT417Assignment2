import junit.framework.*;

public class Main {
	
	public String student;
	
	
	public static void main(String args[]){  
		
		String student = studentClass.Student(args);
		String module = moduleClass.Module(args);
		String programme = programmeClass.Programme(args);
		System.out.println("Student: "+student);
		System.out.println("Module: "+module);
		System.out.println("Programme: "+programme);

//Tried implementing JUnits
		class JavaTest extends TestCase {
		  
		   public void testAdd(){
			String result = student;
		      assertTrue(result == student);

		   }
		}
		
	}


}
