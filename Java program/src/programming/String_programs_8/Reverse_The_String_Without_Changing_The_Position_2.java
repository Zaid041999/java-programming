package programming.String_programs_8;

public class Reverse_The_String_Without_Changing_The_Position_2 {
	public static void main(String[] args) {
		String s ="Welcome to mumbai";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			String rev = "";
			for(int j  = a[i].length()-1;j>=0;j--) {
				rev = rev + a[i].charAt(j);
			}
			System.out.print(rev+" ");
		}
	}
}
