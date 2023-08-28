package programming.array_programs_7;

public class Insertion_Sort_10 {

	public static void main(String[] args) {
		int[] a = {2,4,1,3,6,5};
		int temp ,j;
		
		for (int i = 1; i < a.length; i++) {
			temp =a[i]; // to store the element
			j=i;          //to store the index of store element;
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
/*char[] a = {'z','a','i','d'};
char temp;
int j;
for (int i = 1; i < a.length; i++) {
	temp=a[i];
	j=i;
	while(j>0 && a[j-1]>temp) {
		a[j]=a[j-1];
		j=j-1;
	}
	a[j]=temp;
	
}
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}*/
