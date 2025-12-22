	import java.util.*;
	
public class Armstrong_number {
	
	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter the number :");
	int num=in.nextInt();
	
	int original =num;
	int digits=0;
	int temp =num;
	int sum=0;
	
//	count size
	while(temp > 0) {
		
		digits++;
		temp/=10;
		}
	temp =num;
//	System.out.println(digits);
	
//	armstrong
		while(temp >0) {
			int digit=temp%10;
			sum+=Math.pow(digit, digits);
			temp/=10;
		}
		if(sum ==original ) {
			System.out.println(num + " is armstrong number ");
		}
		else {
			System.out.println(num + " is not armstrong number ");
		}
	}

}
