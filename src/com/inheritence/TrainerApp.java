package com.inheritence;
	// loose coupling without code reduction(polymorplism )
class Trainer{
	void teaches() {
		System.out.println("trainer teaches !");
	}
}

class JavaTrainer extends Trainer{
	void teaches() {
		System.out.println(" java trainer !");

	}
}
class ApiTrainer extends Trainer{
void teaches() {
	System.out.println("Api teaches !");

	}
}
class TestingTrainer extends Trainer{
void teaches() {
	System.out.println("Testing teaches !");

	}
}

public class TrainerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer t;
		t=new JavaTrainer();
		t.teaches();							//loose coupling 
		t=new ApiTrainer();
		t.teaches();
		t=new TestingTrainer();
		t.teaches();
	}

}
