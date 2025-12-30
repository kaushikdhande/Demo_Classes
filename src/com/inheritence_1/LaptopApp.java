package com.inheritence_1;

public class LaptopApp {

	public static void main(String[] args) {
	Laptop l=new Laptop();
	Charger c=new Charger("Dell" ,65);
	l.hasA(c);
	System.out.println(l.os.getBrand());
	System.out.println(l.os.getVersion());
	}

}
class Laptop{
	OS os=new OS("Windows",10.0f);
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getPower());

	}
}

class Charger{
	String brand ;
	int power;
	
	public Charger(String brand ,int power) {
		this.brand =brand;
		this.power=power;
	}
	
	public String getBrand() {
		return brand ;
	}
	public int getPower() {
		return power ;
	}
}

class OS {
	String brand;
	float version;
	public OS(String brand ,float version) {
		this.brand=brand;
		this.version=version;
	}
	String getBrand() {
		return brand;
	}
	public float getVersion() {
		return version ;
	}
	
}