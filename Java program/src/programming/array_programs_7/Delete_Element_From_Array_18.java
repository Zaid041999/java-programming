package programming.array_programs_7;

public class Delete_Element_From_Array_18 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		int del = 3;
		for (int i = 0; i < a.length; i++) {
			if (del==a[i]) {
				for (int j = i; j < a.length-1; j++) {
					a[j]=a[j+1];
				}break;
			}
		}
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
