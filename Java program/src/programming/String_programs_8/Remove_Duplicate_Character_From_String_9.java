package programming.String_programs_8;

public class Remove_Duplicate_Character_From_String_9 {

	public static void main(String[] args) {
		String s = "chocolate";
		char[] c = s.toCharArray() ;
		boolean[] b = new boolean [c.length];
		for (int i = 0; i < b.length; i++) {
			if(b[i] == false) {
			for (int j = i+1; j < b.length; j++) {
				if(c[i]==c[j])
				{
					b[j]=true;
				}
			}
			System.out.print(c[i]);
			}
			
		}
		
	}

}
