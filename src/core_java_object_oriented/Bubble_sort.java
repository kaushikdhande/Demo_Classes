package core_java_object_oriented;
import java.util.*;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {60,20,10,40,50,30};
//		int left=0;
//		int right=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			
		}
		for(int num:arr) {
			System.out.println(num);
		}
		

	}
	

}
