package java_basic;

public class Inverted {

	public static void main(String[] args) {
		
		// Two types to print Inverted triangle
		
		/*for(int i=1;i<=5;i++) {
			// i=1 1<=5 T
			// i=2 2<=5 T
			// i=6 6<=5 F
			for(int j=5;j>=i;j--) {
				// j=5 5<=1 T
				// j=4 4>=1 T
				// J=3 3>=1 T
				// j=2 2>=1 T
				// j=1 1>=1 T
				// j=0 0>=1 F
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// i=5 5>=1 T
		// for(int i=5 i>=1 i--
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				// j=1 1<=5
				// j=2 2<=5
				System.out.print(" * ");
				
			}
			System.out.println();
		}
		
		
		for(int i=1 ; i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		

	}

}
