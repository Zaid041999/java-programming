package looping_programs_4;

public class Reverse_num_is_even_or_odd_P5 {

	public static void main(String[] args) {
		int  n=1234,rev=0,rem;
		while(n!=0) {
			rem = n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
