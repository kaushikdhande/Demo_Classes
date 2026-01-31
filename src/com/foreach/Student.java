package com.foreach;

public class Student {
	
String name;
int age;
String gender;
public Student(String name,int age,String gender) {
	this.name=name;
	this.age=age;
	this.gender=gender;
};
public String getName() {
	return name;
	
}

public int getAge() {
	return age;
	
}
public String getGender() {
	return gender;
	
}

public static void main(String[] args) {
	Student s=new Student("Mayur", 20, "Male");
	Student s1=new Student("Rupesh", 20, "Male");
	Student s2=new Student("Roopa", 22, "Female");
	Student [] arr={s,s1,s2};
for(Student m:arr) {
	System.out.print(m.getName() +" ");
	System.out.print(m.getAge()+" ");
	System.out.print(m.getGender()+ " ");
	System.out.println();
	
}
	
}
}
