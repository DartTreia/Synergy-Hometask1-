
public class University{
	Teacher[] teachers = new Teacher[3];
	University(){
		String[] names = new String[5];
		names[0]="Sergei Alekseevich";
		names[1]="Ivan Andreevich";
		names[2]="Alex Ivanovich";
		names[3]="Nikita Sergeevich";
		names[4]="Andrey Nikitich";
		
		for(int i=0;i<3;i++) {
			int m = (int)(Math.random()*12)-1;
			int n = (int)(Math.random()*5);
			teachers[i] = new Teacher(names[n]);
		}
	}
	
	public void main() {
		for(int i=0;i<3;i++) {
		System.out.println(teachers[i].getName()+" is teaching 3 students. They are ");
		teachers[i].allStudents();
		}
			
			
		
	}
}
