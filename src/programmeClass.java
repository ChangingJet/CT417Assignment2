
public class programmeClass {
	public String courseName = "Matthew";
	public String moduleList = "CT4101, CT414, CT417";
	public String studentList = "Matthew, Callum, Ryan";
	public int acYearStart = 2019;
	public int acYearEnd = 2020;
	 
	
	public String getCourseName() {
        return this.courseName;
    }
	public String getModuleList() {
        return this.moduleList;
    }
	public String getStudentList() {
        return this.studentList;
    }
	public int getacYearStart() {
        return this.acYearStart;
    }
	public int getacYearEnd() {
        return this.acYearEnd;
    }
	
	
	public void setCourseName(String var) {
        this.courseName = var;
    }
	public void setModuleName(String var) {
        this.moduleList = var;
    }
	public void setStudentList(String var) {
        this.studentList = var;
    }
	public void setYearStart(int var) {
        this.acYearStart = var;
    }
    public void setYearEnd(int var) {
        this.acYearEnd = var;
    }
	
}
