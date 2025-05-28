package day_1;

//A Sunny number is a number for which the next number is a perfect square.
	//For example, 8 is a Sunny number because 8 + 1 = 9, and 9 is a perfect square.


        public class SunnyNumber {
        	
		public static void main(String[] args) {
			
			int n=7;
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
				}
			}
			
			
			
		}
		
		
















	
	


