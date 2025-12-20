package core_java_object_oriented;
import java.util.*;
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int arr[]= {10,20,30,40,50,60};
		
		int low=0;
		int high=arr.length-1;
		boolean found =false;
		int  idx=0;
		
		int mid=(low+high)/2;
		while(low <= high) {
			if(arr[mid] == key) {
				found =true;
				idx=mid;
				break;
			}
			else if(key < arr[mid]) {
				high=mid-1;
				mid=(low+high)/2;
			}
			else {
				low =mid+1;
				mid=(low+high)/2;
			}
		}
		if(found ==true) {
			System.out.println(arr[idx]+ " found at " +mid);
		}
		else {
			System.out.println("not found");
		}
	}

}
