package core_java_object_oriented;

import java.util.*;

public class Three_Dimensional_Array {

	public static void main(String[] args) {
									
		//input 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of college :" );
	int size_collage=sc.nextInt();
	System.out.println("enter the size of classes :" );
	int size_classes=sc.nextInt();
	System.out.println("enter the size of students :" );
	int size_student=sc.nextInt();
	int a[][][]=new int [size_collage][size_classes][size_student];
	
								
			
	//enter element in array of 3 dimension
	
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
				System.out.print("Enter the marks of collage["+i+"] in class  ["+j+"] of ["+k+"]");
				a[i][j][k]=sc.nextInt();
					
			}
				
		}	
			
	}
		//     output print 
		System.out.println("marks :");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
		}

	}

}
