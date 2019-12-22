
public class studentClass {
	
	public String name;
	public int age;
	public String DOB;
	public int ID;
	public String username = name+age;
	public String course;
	public String modules;
	
	//public static String Student(String args[]){  
		//String student = "["+name+", "+age+", "+DOB+", "+ID+", "+username+", "+course+", "+modules+"]";
		//System.out.println(student);
		//return student;
	//}
	
	 public String getName() {
	        return this.name;
	    }
	 public int getAge() {
	        return this.age;
	    }
	 public String getDOB() {
	        return this.DOB;
	    }
	 public int getID() {
	        return this.ID;
	    }
	 public String getUsername() {
	        return this.username;
	    }
	 public String getCourse() {
	        return this.course;
	    }
	 public String getModules() {
	        return this.modules;
	    }
	 
	 
	 public void setName(String var) {
	        this.name = var;
	    }
	 public void setAge(int var) {
	        this.age = var;
	    }
	 public void setDOB(String var) {
	        this.DOB = var;
	    }
	 public void setID(int var) {
	        this.ID = var;
	    }
	 public void setUsername(String var) {
	        this.username = var;
	    }
	 public void setCourse(String var) {
	        this.course = var;
	    }
	 public void setModules(String var) {
	        this.modules = var;
	    }

}  

