import java.util.*;

public class Holo_triangle {
	public static void main(String[] args) {
		int i,j,k=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for ( i = 0; i < n; i++) {

            for ( j = i; j < n; j++) {
                System.out.print(" ");
            }
            while(k!=(2*i-1)) {
	            	if(k==0 ||k==2*i-2) {
	            		System.out.print("*");
	            	}
	            	else {
	            		System.out.print(" ");
	            	
	            	k++;
            }
            System.out.println();
         
        }
        for(i=0;i<2*n-1;i++) {
        System.out.print("*");
        }
      
        }}}

    

		



