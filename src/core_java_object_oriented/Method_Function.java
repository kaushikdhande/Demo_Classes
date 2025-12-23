package core_java_object_oriented;

//---------------------------4 types of method------------------------------------------

class StudentM {
	
	int  add(int a ,int b) {
		int c=a+b;
	//  1. no i/p no o/p
//	(1)	int c=a+b;
//		System.out.println(c+ " print ");
		//------------------------------------------]
//		2.no i/p and o/p
//		 return c; 
		 //------------------------------------------i/p mo o/p
			System.out.println(c);
		//-------------------------------------------------------/
//			4.i/p o/p
			return c;
		}
}
public class Method_Function {
								

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentM w1 =new StudentM();
//		w1.add();
		
//		int c=w1.add();
//		System.out.println(c);
		
		w1.add(10,65 );
	}

}
