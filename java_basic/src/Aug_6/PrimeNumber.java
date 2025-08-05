package Aug_6;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%2==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.print("Prime Number");
			}
			else {
				System.out.println("NOT PRIME NUMBER");
			}
		}

	}


