package day_1;

public class NeonNumber {

		public static void main(String[] args) {
			
			int n=6;
			int sum=0, square=n*n;
			
			while(square!=0) {
				int rem=square%10;
				sum=sum+rem;
				square=square/10;
		
			}
			if(n==sum) {
				System.out.println(n + " Neon Number ");
			}else {
				System.out.println(n + " Not a Neon Number ");
			}

		}

	}


