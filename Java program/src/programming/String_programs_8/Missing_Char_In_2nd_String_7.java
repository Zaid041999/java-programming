package programming.String_programs_8;

public class Missing_Char_In_2nd_String_7 {

	public static void main(String[] args) {
		String s1="abcdefg";
		String s2 ="abcdeg";
		
		int i =0;
		for(;i<s2.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				break;
			}
		}
		System.out.println("Missing Character:"+s1.charAt(i));

	}

}
