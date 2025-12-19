package core_java_object_oriented;

import java.util.*;

public class Aarray_2d {
									//optizmised way
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the rows size : ");
	int n=sc.nextInt();
	System.out.println("Enter the rows size : ");
	int m=sc.nextInt();
	 int a[][]=new int [n][m];
	 
	 for(int i=0;i<n;i++) {
		 for(int j=0;j<m;j++) {
			System.out.println("enter the marks of student " +i+ " " +j);
			a[i][j]= sc.nextInt();
			 }
	 }
	 for(int i=0;i<n;i++) {
		 for(int j=0;j<m;j++) {
			 System.out.print(a[i][j] +" ");

		 }
		 System.out.println();
	 }
	 
	 

}
}
