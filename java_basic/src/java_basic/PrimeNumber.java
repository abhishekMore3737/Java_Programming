package java_basic;
import java.util.*;
public class PrimeNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		

		/*  for(int i=1;i<=num;i++) {
			if(num%i==0) {
				// 1 % 7=1 
				// 2 % 7=0
				// 3% 7 =0
				// 4% 7=0
				// 5% 7=0
				// 6 %7 =0
				// 7% 7=1


				count++;

			}
		}
		if(count==2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
		*/
		
		
		// find prime from 1 to 100
		// ->2 3 5 7 11 13 ....97
		for(int j=1;j<=num;j++) {
			int count=0;
		for(int i=1;i<=j;i++) {
			if(j%i==0) {
				count++;
			}
			}
			if(count ==2) {
				System.out.println(j);
			}
		}

	}

}


