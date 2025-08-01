package java_basic;
import java.util.*;
public class EvenOdd {
 // Even and  odd Programm by using for loop and also print their sum 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		int sum=0 ;
		int sum1=0;
		System.out.print("Even =");
		for(int i=1;i<=num;i++) {
			if(i %2 ==0) 
			{

				System.out.print(i + " " );

				sum=sum+i;



			}

		}
		System.out.print("sum="+sum);
		System.out.println();
		System.out.print("Odd =");
		for (int i=1;i<=num;i++) {
			if(i% 2!=0) {
				System.out.print(i +" ");
				sum1=sum1+i;

			}

		}
		
		System.out.println("sum1 = "+sum1);
		
		
		
		System.out.print(" Even Number :");
		for(int i=1;i<=num;i++) {
			if( i% 2==0) {
				System.out.print("  " + i);
				
			}
			
		}
		System.out.println();
		System.out.print("Odd/ Number :");
		for(int i=1;i<=num;i++) {
			if( i% 2 !=0) {
				System.out.print(" "+i);
			}
		}
 
	}

}


