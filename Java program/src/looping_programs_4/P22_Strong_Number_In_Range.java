package looping_programs_4;

public class P22_Strong_Number_In_Range {

	public static void main(String[] args) {
		for(int n = 1; n<1000 ;n++)
		{
			int temp = n;
			int sum =0;
			while(n!=0) {
				int d = n%10;
				sum = sum + factorial(d);
				n = n/10;
			}
			
			if(sum == temp) {
				System.out.println("strong no: "+temp);
			}
			/*else {
				System.out.println("not a strong number: "+temp);
			}*/
			n = temp;
		}} 

	public static int factorial(int rem) {
		int fact = 1;
		for (int i = 1; i <= rem; i++) {
			fact = fact * i;

		}
		return fact;
	}

}
