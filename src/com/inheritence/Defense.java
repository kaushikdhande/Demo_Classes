package com.inheritence;
// tight coupling without code reduction(False polymorphism)

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

public class Defense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Security_Force s=new Security_Force();
		Army am =new Army();
		Navy n=new Navy();		//tight coupling
		AirForce ai=new AirForce();
		System.out.println(">>>>>>>>>>>>>>>>>>> Army <<<<<<<<<<<<<<<<<<<<");
		am.job();
		am.protect();
		am.useTank();
		
		System.out.println(">>>>>>>>>>>>>>>>>>> Navy <<<<<<<<<<<<<<<<<<<<");
		n.job();
		n.protect();
		n.useShip();
		
		System.out.println(">>>>>>>>>>>>>>>>>>> AirForces <<<<<<<<<<<<<<<<<<<<");
		ai.job();
		ai.protect();
		ai.useJets();
		
	}

}
