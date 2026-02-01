
public class Holo_triangle {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				if(k==0 || i==4) {
					System.out.print("-");
				}else {
				System.out.print(" ");
				}
			}
			for(int k=1;k<=i+1;k++) {
				if(i==4|| k==0 ||i==0||i==1||i==2|| k==4) {
					System.out.print("-");
				}
				else {
				System.out.print(" ");
			}
			}
			
			System.out.println();

		}

	}

}
