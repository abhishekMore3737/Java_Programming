package java_basic;
import java.util.*;
public class FibonacciCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fibonacci Series 0 1 1 2 3 5 8 13 
		
		
		
		
		Scanner sc= new Scanner (System.in);
		int num=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		
		for(int i=1;i<=num;i++) {
		
			// n1=0 n2=1 =  n3= 0 + 1 =1
			// n1=1 n2=1 =  n3= 1 + 1 = 2
			// n1=1 n2=2 = n3= 1 + 2 = 3
			// n1=2 n2=3 = n3= 2 + 3 =5
			
			
			
			int n3=n1+n2;
			System.out.print(" "+n3);
			 n1=n2;
			 n2=n3;
		}

	}

}
