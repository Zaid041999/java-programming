package looping_programs_4;

public class P21_StrongNumber_Check {

	public static void main(String[] args) {
		  int n =144;
		  int temp  = n ;
		   int sum =0;
		   while( n != 0) {
			   int rem = n%10;
			   sum =sum + factorial(rem);
			   n = n/10;
		   }if(sum==temp) {
			   System.out.println("Strong number");
		   }else {
			   System.out.println("Not a strong number");
		   }

	}
	public static int factorial(int rem) {
		int fact=1;
		for(int i =1;i<=rem;i++) {
			fact = fact * i;
			
		}
		return fact;
	}

}
