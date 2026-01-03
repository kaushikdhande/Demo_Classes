
import java.util.*;
public class Fibonacci_series {
	
	static void fibo(int n) {
		int n1=0,n2=1;
		for(int i=0;i<n;i++) {
			System.out.print(n1+ " ");
			int m=n1+n2;
			n1=n2;
			n2=m;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibo(10);
	}

}
