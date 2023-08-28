package looping_programs_4;

public class Saparate_The_Digit_P6 {

	public static void main(String[] args) {
		int n =123,rem;
		while (n!=0) {
			rem = n%10;
			System.out.println(rem);
			n=n/10;
		}

	}

}
