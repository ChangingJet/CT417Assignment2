import java.util.ArrayList;

public class studentClass {
	
	public static String name = "Matthew";
	public static int age = 22;
	public static String DOB = "1/12/1997";
	public static int ID = 16497746;
	public static String username = name+age;
	public static String course = "Electronic + Computer Engineering";
	public static String modules = "CT417";
	
	private static String moduleName = "Software Engineering III";
	private static String moduleID = "CT417";
	private static String studentList = "Matthew, Callum, Ryan";
	
	public static void Student(String args[]){  
		String student = "["+name+", "+age+", "+DOB+", "+ID+", "+username+", "+course+", "+modules+"]";
		System.out.println(student);
	}

}  

