package String_practice_set;

public class Diamond_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("+");
			}
			for(int k=1;k<=i+1;k++) {
				System.out.print("+");
			}
			
			System.out.println();

		}
		for(int i=5;i>=0;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print("+");
			}
			for(int k=1;k<=i+1;k++) {
				System.out.print("+");
			}
			
			System.out.println();
			
	}
	}

}
