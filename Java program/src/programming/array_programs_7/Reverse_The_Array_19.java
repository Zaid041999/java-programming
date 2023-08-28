package programming.array_programs_7;

public class Reverse_The_Array_19 {

	public static void main(String[] args) {

		int[] a= {1,2,3,4,5};
		reverse(0,a.length-1,a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

}

	private static void reverse(int start, int end, int[] a) {
		while(start<end) {
			int temp = a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}

		
	}
}
/*int[] a= {1,2,3,4,5};
for (int i = 0; i < a.length/2; i++) { //middle num will be s it is
	int temp=a[i];
	a[i]=a[a.length-1-i];
	a[a.length-1-i]=temp;
}
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}
}*/