package com.collection_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class StudentApp{
	public static void main(String[] args) {
		Student s1=new Student(101, "Kaushik", 21, "male", 957932, 80, 7, "kaushikdhande@gmail.com","Juni Shukrwari", 171.1, 75, "O+");
		Student s2=new Student(102, "Rehman", 21, "male", 957932, 80, 7, "rehman@gmail.com","Juni Shukrwari", 171.1, 75, "O+");
		Student s3=new Student(103, "Ram", 21, "male", 957932, 80, 7, "ram@gmail.com","Juni Shukrwari", 171.1, 75, "O+");
		Student s4=new Student(104, "George", 21, "male", 957932, 80, 7, "george@gmail.com","Juni Shukrwari", 171.1, 75, "O+");
		Student s5=new Student(105, "David", 21, "male", 957932, 80, 7, "david@gmail.com","Juni Shukrwari", 171.1, 75, "O+");
//		HashMap<Student,Integer>map =new HashMap<>();
		LinkedHashMap<Student, Integer> map=new LinkedHashMap<>();
//		TreeMap<Student,Integer> map=new TreeMap<>();
		map.put(s1,201 );
		map.put(s2,202 );
		map.put(s3,203 );
		map.put(s4,204 );
		map.put(s5,205 );
System.out.println(map);		
		
	}
}
class Student{

	int id;
	String name;
	int age;
	String gender;
	int mob_no;
	int marks;
	int sem;
	String e_mail;
	String address;
	double height;
	double weight;
	String blood_group;

	public Student(int id, String name, int age, String gender, int mob_no, int marks, int sem, String e_mail,
			String address, double height, double weight, String blood_group) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mob_no = mob_no;
		this.marks = marks;
		this.sem = sem;
		this.e_mail = e_mail;
		this.address = address;
		this.height = height;
		this.weight = weight;
		this.blood_group = blood_group;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMob_no() {
		return mob_no;
	}
	public void setMob_no(int mob_no) {
		this.mob_no = mob_no;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getBlood_group() {
		return blood_group;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", mob_no=" + mob_no
				+ ", marks=" + marks + ", sem=" + sem + ", e_mail=" + e_mail + ", address=" + address + ", height="
				+ height + ", weight=" + weight + ", blood_group=" + blood_group + "]";
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}	
}
