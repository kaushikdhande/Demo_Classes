package core_java_object_oriented;

import java.util.*;

public class Aarray_2d {
									//optizmised way
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the rows size : ");
	int row=sc.nextInt();
	System.out.println("Enter the column size : ");
	int column=sc.nextInt();
	 int a[][]=new int [row][column];
	 
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<column;j++) {
			System.out.println("enter the marks of student " +i+ " " +j);
			a[i][j]= sc.nextInt();
			 }
	 }
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<column;j++) {
			 System.out.print(a[i][j] +" ");

		 }
		 System.out.println();
	 }
	 
	 

}
}
