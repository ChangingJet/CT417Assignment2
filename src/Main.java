import static org.junit.Assert.assertTrue;

import junit.framework.*;

public class Main {
	
	public String student;
	
	
	@SuppressWarnings("restriction")
	public static void main(){  
		
		studentClass obj = new studentClass();
		obj.setName("Matthew");
		obj.setAge(21);
		obj.setDOB("01/12/1997");
		obj.setID(16497746);
		obj.setUsername(obj.getName()+obj.getDOB());
		obj.setCourse("CT417");

		programmeClass obj1 = new programmeClass();
		obj1.setCourseName("Software Engineering III");
		obj1.setModuleName("CT417");
		obj1.setStudentList("Matthew, Callum, Ryan");
		obj1.setYearStart(2019);
		obj1.setYearEnd(2020);
		
		moduleClass obj2 = new moduleClass();
		obj2.setModuleName("CT417, CT414, CT1101");
		obj2.setModuleID("CT417");
		obj2.setStudentList("Matthew, Callum, Ryan");
			
		String result = obj.getName();
	    assertTrue(result == obj.getName());


//Tried implementing JUnits
		class JavaTest extends TestCase {
		  
		   public void testAdd(){
			String result = obj.getName();
		      assertTrue(result == obj.getName());

		   }
		}
		
	}


}
