package com.sotingcomplexobject;

public class Word {

	public static void main(String[] args) {
	String s1="SACHIN";
	String s2="SAURAV";
	int res=s1.compareTo(s2);
	System.out.println(res);
	if(res>0) {
		System.out.println("s1 greater");
	}
	else if(res<0) {
		System.out.println("s2 greater ");
	}
	if(res>0) {
		System.out.println(" equal");
	}
	
	}

}
