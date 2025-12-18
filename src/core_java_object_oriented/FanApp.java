package core_java_object_oriented;

public class FanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fan f1 =new Fan();
		Fan f2=new Fan();
		
		
		f1.name="Cropmtom";
		f1.cost=2000;
		f1.color="red";
		f2.name="surya";
		f2.cost=1000;
		f2.color="blue";
		System.out.println(f1.name +":" +f1.cost +":" +f1.color);
		System.out.println(f2.name +":" +f2.cost +":" +f2.color);

	}

}

class Fan{
	String name;
	int cost;
	String color;
}
