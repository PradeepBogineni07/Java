package day_1;

	import java.util.Scanner;

	public class SunnyNumberUsingScanner {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Value: ");
					int n=sc.nextInt();
					int num=n+1;
					
					boolean isSunny=false;
					
					for(int i=1;i*i<=num;i++) {
						if(i*i==num) {
							isSunny=true;
							break;
						}
						}
						if(isSunny) {
							System.out.println(n  + " is a Sunny Number");
						}else {
							System.out.println(n+ " is Not a Sunny Number");
						}}}

