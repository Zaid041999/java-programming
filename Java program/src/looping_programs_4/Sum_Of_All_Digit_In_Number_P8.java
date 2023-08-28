package looping_programs_4;

public class Sum_Of_All_Digit_In_Number_P8 {

	public static void main(String[] args) {
		int n =1113,sum=0,rem;
		while(n!=0) {
			rem = n %10;
			sum =sum +rem;
			n=n/10;
		}
		System.out.println(sum);
	}

}
