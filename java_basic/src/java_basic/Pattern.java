package java_basic;

public class Pattern {

	public static void main(String[] args) {

		//for(int i=1;i<=5;i++) {
		//System.out.println("*"); // vertical print
		//System.out.print(" * "); // horizontal print

// Rectangle programm
		// outer loop for rows

		for(int i=1;i<=5;i++) { 
			// i=1 1<=5  T
			// i=2 2<=5  T
			// i3 3<=5   T
			// i=4 4<=5  T
			// i=5 5<=5  T
			// i=6 6<=6  F

			// inner loop for col

			for(int j=1;j<=5;j++) {
				// j=1 1<=5    T
				// j=2 2<=5    T
				// j=3 3<=5    T
				// J=4  4<=5   T
				// j=5   5<=5  T
				// J=6  6<=5   F
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}


