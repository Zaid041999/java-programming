package programming.array_programs_7;

public class Selection__Sort_12 {

	public static void main(String[] args) {
		int[] a= {22,45,3,1,5,6,7};
		int min, temp;
		for (int i = 0; i < a.length; i++) {
				min=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]<a[min]) {
					min=j;
				}
				
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}/*String[] a= {"zaid","alphiya","fazal","bushara"};
int min;String temp="";
for (int i = 0; i < a.length; i++) {
		min=i;
	for (int j = i+1; j < a.length; j++) {
		if(a[j].compareTo(a[min])<0) {
			min=j;
		}
		
	}
	temp=a[i];
	a[i]=a[min];
	a[min]=temp;
}
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}*/

