package programming.String_programs_8;

public class Remove_Spacing_From_String_8 {

	public static void main(String[] args) {
		String s = "Welcome to mumbai";
		String out ="";
		//char[] c = s.toCharArray();
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ') {
				out = out + s.charAt(i);
			}
		}
		System.out.println(out);
		//System.out.println(out);

	}

}
