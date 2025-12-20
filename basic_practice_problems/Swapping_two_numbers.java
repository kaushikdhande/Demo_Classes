import java.util.*;
public class Swapping_two_numbers {
	
//															//swaping two numbers
//	static void swap(int arr[],int index_1,int index_2) {
//		int temp =arr[index_1];
//		arr[index_1]=arr[index_2];
//		arr[index_2]=temp;
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[]= {1,2,3,4,5,6,7};		
//		swap(arr,1,3);
//		for(int n :arr) {
//			System.out.println(n);
//		}
//	}
	
												// user input of two array for swapping index;
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array 1 :");
	int  a1=sc.nextInt();
	int [] arr1=new int [a1];
	System.out.print("Enter the element of array 1 :");
	for (int i = 0; i < a1; i++) {
		arr1[i]=sc.nextInt();
	}
	System.out.println("Enter the size of array 2 :");
	int  a2=sc.nextInt();
	int [] arr2=new int [a2];
	System.out.print("Enter the element of array 2 :");
	for (int i = 0; i < a2; i++) {
		arr2[i]=sc.nextInt();
	}
	System.out.println("enter the index from array 1 :");
	int index1=sc.nextInt();
	System.out.println("enter the index from array 2 :");
	int index2=sc.nextInt();
	
						// validation index
	if(index1 < 0 || index1 >= a1 ||index2 < 0 || index2 >= a2){
		System.out.println("index entered is wrong !");
		return;
	}
	
												//swapping
	int temp =arr1[index1];
	arr1[index1]=arr2[index2];
	arr2[index2]=temp;
	 System.out.println("After swapping 1 array :");
	 for(int num :arr1) {
		 System.out.println(num +"");
	 }
	 System.out.println("After swapping 2 array :");
	 for(int num :arr2) {
		 System.out.println(num +"");
	 }
	 sc.close();
	}
	

}
