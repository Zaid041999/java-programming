package programming.array_programs_7;

public class Largest_Element_In_the_Array_4 {

	public static void main(String[] args) {
		int[] a = {6,20,7,1,3,2,5,9,4,8,10};
		int large = a[0];
		for(int i =0 ;i<a.length;i++) {
			if(a[i]>large) {
				large = a[i];
			}
		}
		System.out.println("Largest num in the array:" + large);
				
	}

}
