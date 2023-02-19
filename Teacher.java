
public class Teacher {
	
	Student[] students = new Student[3];
	private String name;
	Teacher(String name){
		this.name=name;
		String[] names = new String[5];
		names[0]="Sergei";
		names[1]="Ivan";
		names[2]="Alex";
		names[3]="Nikita";
		names[4]="Andrey";
	for(int i=0;i<3;i++) {
		int m = (int)(Math.random()*12)+1;
		int n = (int)(Math.random()*5);
		students[i] = new Student(m,m+7,names[n]);
	}
	}
	public void allStudents() {
		for(int i=0;i<3;i++)
		System.out.println("   "+students[i].getAge()+" years old "+students[i].getName()+" is study in "+students[i].getGrade()+" grade!");
	}
	public String getName() {
		return this.name;
	}
}
