package programming.array_programs_7;

public class Second_Largest_Element_In_Array_5 {

	public static void main(String[] args) {
		int[] a= {12,13,14,12,11,16,16,15};
		int large = a[0];
		int slarge = 0;
		
		for(int i =1;i<a.length;i++) {
			if(a[i]>large) {
				slarge = large;
				large = a[i];
			}else if(a[i]>slarge && a[i]!=large) {
				slarge=a[i];
			}
		}
		System.out.println("Largest num : " +large);
		System.out.println("Second largest : "+ slarge);
	}

}
