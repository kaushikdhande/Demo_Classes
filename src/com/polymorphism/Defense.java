package com.polymorphism;

public class Defense {

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
		sf.job();
	}

}


class Security_Force{
	public  void job(){
		System.out.println("to protect");
	}
	public void protect() {
		System.out.println("Defense security");

		}
	
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

