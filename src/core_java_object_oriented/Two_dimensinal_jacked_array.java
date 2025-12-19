package core_java_object_oriented;

import java.util.*;
public class Two_dimensinal_jacked_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//no of sub array
		System.out.println("Enter the no. of sub-array : ");
		int classes=sc.nextInt();
		
		int jaged_array[][]=new int [classes][];
		
		for(int i=0;i<classes;i++) {
			System.out.println("enter the size of sub-array : "+(i+1));
			int sizeOfSubArray =sc.nextInt();
			jaged_array[i]=new int [sizeOfSubArray];
		}
		for(int i=0;i<classes;i++) {
			System.out.println("Enter the element of Sub-array " +(i+1));
			for(int j=0;j<jaged_array[i].length;j++) {
				jaged_array[i][j]=sc.nextInt();
			}
		}
		System.out.println("jagged array : ");
		for(int i=0;i<classes;i++) {
			for(int j=0;j<jaged_array[i].length;j++) {
				System.out.print(jaged_array[i][j] + " ");
			}
			System.out.println();
		}
		
	}
		
}
