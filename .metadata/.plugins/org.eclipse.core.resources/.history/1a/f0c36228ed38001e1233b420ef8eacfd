package programming.String_programs_8;

public class Anagram_12 {

	public static void main(String[] args) {
		String s1="java";
		String s2="aajv";
		if(s1.length()==s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			sort(c1);
			sort(c2);
			boolean b = true;
			for (int i = 0; i < c2.length; i++) {
				
				if(c1[i]!=c2[i]) {
					b=false;
					break;
				}
			}
			if(b==true) {
				System.out.println("String is an anagram");
			}else {
				System.out.println("String is not an anagram");
			}
		}else {
			System.out.println("Not an anagram");
		}

	}

	public static void sort(char[] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length-1; j++) {
				if(c[j]>c[j+1]) {
					char temp = c[j];
					c[j]=c[j+1];
					c[j+1]=temp;
					
				}
				
			}
		}
		
	}

}
