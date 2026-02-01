package com.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Student_Record_Management {

	public static void main(String[] args) {
		File file = new File("student.txt");
		try {
			FileWriter fw = new FileWriter(file,true);
			 BufferedWriter bw = new BufferedWriter(fw);
			 int id=10;
			 int marks=90;
			 String name="Mayur";
			 bw.write(id+","+name+","+marks);
			 bw.newLine();
			 bw.close();
			 System.out.println("Student records:- ");
			 FileReader fr = new FileReader(file);
		        BufferedReader br = new BufferedReader(fr);
		        String line;
		        while((line=br.readLine() )!=null) {
		        	System.out.println(line);
		        }
		        br.close();
		}
		catch(Exception e) {
			System.out.println("Error:- "+e);
	}

}
}