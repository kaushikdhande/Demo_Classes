package com.abstraction;



public class Defense1 {

	public static void main(String[] args) {
		System.out.println(">>>>>>>>>>>>>>>>>>> Army <<<<<<<<<<<<<<<<<<<<");
		protectMain(new Army());
		System.out.println(">>>>>>>>>>>>>>>>>>> Navy <<<<<<<<<<<<<<<<<<<<");

		protectMain(new Navy());
		System.out.println(">>>>>>>>>>>>>>>>>>> AirForces <<<<<<<<<<<<<<<<<<<<");

		protectMain(new AirForce());

		
	}
	static void protectMain(Security_Force sf) {
		sf.protect();
		
	}

}


 abstract class Security_Force{
	abstract void protect();

		}
	

class Army extends Security_Force{
	 public void protect(){
			System.out.println("to protect land");

	}
	 protected void useTank() {
			System.out.println("use Tank");

	}
}

class Navy extends Security_Force{
	public void protect(){
		System.out.println("to protect water");

	}
	protected void useShip() {
		System.out.println("use ship");

	}
}
class AirForce extends Security_Force{
	public void protect(){
		System.out.println("to protect air");

	}
	protected void useJets(){
		System.out.println("use air");

	}
}

