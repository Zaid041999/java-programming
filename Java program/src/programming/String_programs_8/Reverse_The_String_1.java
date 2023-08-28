package programming.String_programs_8;

public class Reverse_The_String_1 {

	public static void main(String[] args) {
		String s="Zaid";
		//char[] c =s.toCharArray();
		String rev = "";
		/*for (int i =  c.length-1; i >=0; i--) {
			rev 
		}*/
		for(int i = s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
			
		}
		System.out.println(rev);

	}

}
