package programming.array_programs_7;

public class Insert_Element_In_Array_17 {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		int pos =3;
		int ele= 25;
		for (int i = a.length-1; i >=pos-1; i--) {
			a[i]=a[i-1];
			
		}
		a[pos-1]=ele;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	

}
