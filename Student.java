
public class Student {

	private int grade;
	private int age;
	private String name;
	
	Student(int grade,int age,String name) {
		this.grade = grade;
		this.age = age;
		this.name = name;
	}
	
	public int gradeUp() {
		if(this.grade>0 && this.grade<12) 
		this.grade++;
		return grade;
		
		
	}
	
	public String studentRename(String name) {
		this.name=name;
		return name;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
}
