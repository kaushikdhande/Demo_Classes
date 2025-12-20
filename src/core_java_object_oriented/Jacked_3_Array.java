package core_java_object_oriented;

import java.util.*;

public class Jacked_3_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		
		System.out.println("enter the size of college :" );
		int size_collage=sc.nextInt();
		System.out.println("enter the size of classes :" );
		int size_classes=sc.nextInt();
		System.out.println("enter the size of students :" );
		int size_student=sc.nextInt();
//		int b[][][]=new int [size_collage][size_classes][size_student];
		
		int  b [][][]=new int [3][][];
		b[0]=new int [2][];
		b[1]=new int [3][];
		b[2]=new int [2][];
		
		//0
		b[0][0]=new int [2];
		b[0][1]=new int [2];
		//1
		b[1][0]=new int [3];
		b[1][1]=new int [2];
		b[1][2]=new int [4];
		//2
		b[2][0]=new int [3];
		b[2][1]=new int [2];
			
		//	eneter elements in array
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				for(int k=0;k<b[i][j].length;k++) {
				System.out.print("Enter the marks of collage["+i+"] in class  ["+j+ "] of ["+k+"]");
				b[i][j][k]=sc.nextInt();	
			}
		System.out.println();
		}		
		System.out.println();
	}
		
		//   print
		System.out.println("marks :");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				for(int k=0;k<b[i][j].length;k++) {
					System.out.print(b[i][j][k] + " ");
				}
				System.out.println();
			}
		}

	}
}
