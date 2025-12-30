package com.polymorphism;

public class TendulkarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tendulkar t=new ArjunTendulkar();
		t.job();
		t.profession();
		((ArjunTendulkar)t).smoke();	// down casting
	}

}

class Tendulkar{
	void job() {
		System.out.println("play cricket ");
	}
	void profession() {
		System.out.println("he is batsman");
	}
}

class ArjunTendulkar extends Tendulkar{
	void profession() {
		System.out.println("he is bowler");
	} 
	void smoke() {
		System.out.println("he used to smoke");
	}
}