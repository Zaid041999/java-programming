package looping_programs_4;

public class P14_Palindrome_or_not {

	public static void main(String[] args) {
		int n = 121;
		int temp = n;
		int rem,rev=0;
		while(temp!=0) {
			rem = temp%10;
			rev = rev *10+rem;
			temp = temp /10;
		}
		if(n == rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}

	}

}
  