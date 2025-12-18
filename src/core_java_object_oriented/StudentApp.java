package core_java_object_oriented;

public class StudentApp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1=new Student();
//		s1.name="Kaushik";
//		s1.age=21;
//		s1.college_id=220100442;
//		s1.play();
//		System.out.println(s1.name+":"+ s1.age + ":" +s1.college_id);
//		Student s2=new Student();
//		s2.name="Nishant";
//		s2.age=22;
//		s2.college_id=220100438;
//		s2.play();
//		System.out.println(s2.name+":"+ s2.age + ":" +s2.college_id);
		
	//	---------------------------------------------------------------------
				Student s1=new Student(); 
				System.out.println("before assigning");
				System.out.println(s1.name);
				System.out.println(s1.age);
				System.out.println(s1.gender);
				System.out.println("after assigning");
				s1.name="lala";
				s1.age=21;
				s1.gender="male";
				System.out.println(s1.name);
				System.out.println(s1.age);
				System.out.println(s1.gender);


		}

}
class Student{
	String name;
	int age;
	String gender;
	void study() {
	System.out.println("Studing..");

	}
}
