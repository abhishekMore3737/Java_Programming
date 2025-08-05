package java_basic;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			// i=1 1<=5 T
			// i=2 2<=5 T
			// i=6 6<=5 F 
			
			for(int j=1;j<=i;j++) {
				// j=1 1<=1 T
				// j=2  2<=1 F
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
