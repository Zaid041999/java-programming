package looping_programs_4;

public class P20_Niven_Number_Or_Not {

	public static void main(String[] args) {
		int n = 27;
		int temp = n;
		int sum = 0;
		while (n!=0) {
			int rem =  n%10;
			sum = sum + rem;
			n = n/10;
			
		}
		if(temp%sum==0) {
			System.out.println("Niven Number");
		}else {
			System.out.println("Not A Niven Number");
		}

	}

}
//Niven number means the number is fully divisible by its sum of digit    