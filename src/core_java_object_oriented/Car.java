package core_java_object_oriented;

public class Car {
	
	class Tesla{
		String model;
		int year;
		void self(){
		System.out.println("self-driving mode .");

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		Tesla t1=c.new Tesla();
		t1.model="XYZ";
		t1.year=2021;
		t1.self();
		System.out.println("Tesla model "+t1.model+":" +t1.year+":");
	}

}
