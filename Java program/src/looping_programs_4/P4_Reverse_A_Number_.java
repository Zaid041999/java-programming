package looping_programs_4;

public class P4_Reverse_A_Number_ {

	public static void main(String[] args) {
		int rem ,rev=0;
		int n =54321;
		while(n!=0) {
			rem = n%10;
			rev =rev *10 +rem;
			n=n/10;
		}
		System.out.println(rev );
	}

}
