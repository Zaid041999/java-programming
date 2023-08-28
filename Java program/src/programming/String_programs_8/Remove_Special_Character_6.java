package programming.String_programs_8;

public class Remove_Special_Character_6 {

	public static void main(String[] args) {
		String s = "@Z*a%i#d!";
		String str = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str);
	}

}
