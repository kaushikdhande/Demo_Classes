
public class Missing_number_from_array {

	public static  int  missing_num(int [] arr) {
		int sum=0;
		int n=arr.length+1;
		int totalsum=(n*(n+1))/2;
		for(int i=0;i<arr.length;i++) {
		 sum+=arr[i];
		}
		
		return totalsum-sum;
	}
	public static void main(String[] args) {
		int [] arr= {1,2,4,5,6,7};
		int result=missing_num(arr);
		System.out.println("Missing number :" + result);
	}

}
