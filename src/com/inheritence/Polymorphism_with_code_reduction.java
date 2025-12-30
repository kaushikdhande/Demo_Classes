package com.inheritence;

public class Polymorphism_with_code_reduction {

	public static void main(String[] args) {
		duty(new JavaTrainer1() );
		duty(new ApiTrainer1() );
		duty(new JavaTrainer1() );

	}
	
	static void duty(Trainer1 t) {
		t.teaches();
	}

}

class Trainer1{
	void teaches() {
		System.out.println("trainer teaches !");
	}
}

class JavaTrainer1 extends Trainer1{
	void teaches() {
		System.out.println(" java trainer !");

	}
}
class ApiTrainer1 extends Trainer1{
void teaches() {
	System.out.println("Api teaches !");

	}
}
class TestingTrainer1 extends Trainer1{
void teaches() {
	System.out.println("Testing teaches !");

	}
}
