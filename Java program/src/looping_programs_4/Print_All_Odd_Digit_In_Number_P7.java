package looping_programs_4;

public class Print_All_Odd_Digit_In_Number_P7 {

	public static void main(String[] args) {
		int n =15273,rem;
		while(n!=0) {
			rem = n%10;
			if(rem%2==1) {
				System.out.println(rem);
			}
			n=n/10;
		}
	}

}
