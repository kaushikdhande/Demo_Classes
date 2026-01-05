
public class Max_Min_array {
	
	static void max_min(int [] arr) {
		int n=arr.length;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i] > max) {
				max=arr[i];
			}
			if(arr[i] < min) {
				min=arr[i];
			}

		}
		System.out.println("Array :");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println("");
		System.out.println("Max value :" +max);
		System.out.println("Min value :" +min);

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,3,43,33,87,67};
		max_min(arr);
	}

}
