
public class Insertion_sort {

	public static void main(String[] args) {
		int arr[]= {23,1,10,5,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]> arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			for(int num :arr) {
				System.out.println(num);

			}
		}
	}

}
