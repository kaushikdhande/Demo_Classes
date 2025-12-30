package package2;

import package1.DemoApp;

public class Demo3 {
	void disp3() {
	DemoApp d=new DemoApp();
	System.out.println(d.a);
//	System.out.println(d.b);	different package different class not access
//	System.out.println(d.c);
//	System.out.println(d.d);
	}
}

 class Demo4 extends DemoApp {
	void disp4() {
	System.out.println(a);
	System.out.println(b);	
//	System.out.println(c);			differnt package child class not access
//	System.out.println(d);
	}
}
