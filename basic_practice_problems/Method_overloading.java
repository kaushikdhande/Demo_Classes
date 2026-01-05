
public class Method_overloading {

	
	public static void main(String[] args) {
	Calc c=new Calc();
	c.add(10.0f,5);
	}

}
class Calc {
	void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	void add(float a,int b) {
		float c=a-b;
		System.out.println(c);
	}
}
