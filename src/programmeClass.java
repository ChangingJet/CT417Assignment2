
public class programmeClass {
	public static String courseName = "Matthew";
	public static String moduleList = "CT4101, CT414, CT417";
	public static String studentList = "Matthew, Callum, Ryan";
	public static int acYearStart = 2019;
	public static int acYearEnd = 2020;
	
	
	public static void Programme(String args[]){  
		String student = "["+courseName+", "+moduleList+", "+studentList+", "+acYearStart+", "+acYearEnd+"]";
		System.out.println(student);
	}  
}
