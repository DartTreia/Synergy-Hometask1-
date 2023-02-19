
public class Main {

	public static void main(String[] args) {
		Student student = new Student(7,14,"Ivan");
		student.gradeUp();
		System.out.println("Now this student in "+student.getGrade()+" grade!");
		student.studentRename("Egor");
		System.out.println("Now this student's name is "+student.getName());
		Teacher teacher = new Teacher("Vasiliy");
		University university = new University();
		university.main();
	}

}
