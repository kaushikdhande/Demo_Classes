
public class Bubble_sort {

	static void b_sort(int []arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n-1-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp=arr[i];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			
		}
		}
		for(int num:arr) {
		System.out.println(num);
		}
		}
	public static void main(String[] args) {
		int []arr = {6,5,4,3,2,1};
		b_sort(arr);
	}

}
