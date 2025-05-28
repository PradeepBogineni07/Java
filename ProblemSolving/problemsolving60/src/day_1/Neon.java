package day_1;


	//A Neon number is a number where the sum of digits of its square is equal to the number itself.
	//For example, 9 is a Neon number because 9² = 81, and 8 + 1 = 9.


	import java.util.Scanner;
	
        public class Neon {
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in); 
			System.out.print("Enter Number : ");      
			int n=sc.nextInt();
			int sum=0 , square=n*n;
			
			while(square!=0) {
				int rem=square%10;
				sum=sum+rem;
				square=square/10;
				
			}
			if(n==sum) {
				System.out.println(n + " Neon Number ");
			}else {
				System.out.println(n + " Not a Neon Number");
					
				}
			}
			
        }