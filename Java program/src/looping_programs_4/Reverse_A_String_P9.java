package looping_programs_4;

public class Reverse_A_String_P9 {

	public static void main(String[] args) {
		String name= "zaid";
		String rev ="";
		int leng = name.length();
		for(int i=leng-1;i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		System.out.println("Reverse of a name " + name + " is " + rev);
}

}
