package programming.String_programs_8;

public class Shortest_String_11 {

	public static void main(String[] args) {
		String []s= {"coffee","tea","dal","poha","burger","pizza"};
		String min = s[0];
		for (int i = 0; i < s.length; i++) {
			if(s[i].compareTo(min)>0) {
				min=s[i];
			}
		}
		System.out.println(min);

	}

}
