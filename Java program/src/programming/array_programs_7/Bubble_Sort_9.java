package programming.array_programs_7;

public class Bubble_Sort_9 {

     public static void main(String[] args) {
		/*int[] a= {21,12,34,33,10,11};
		int temp;
		for(int i = 0 ; i < a.length;i++) {
			for(int j = 0 ; j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}*/
	int[] a= {21,12,34,33,10,11};
		int temp;
		for(int i = 0 ; i < a.length;i++) {
			int flag = 0;
			for(int j = 0 ; j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
    	 
    	 
	

	}

}

/*
 
String[] a= {"ramesh","veer","deepak","alph"};
		String temp;
		for(int i = 0 ; i < a.length;i++) {
			int flag = 0;
			for(int j = 0 ; j<a.length-1;j++) {
				if(a[j].compareTo(a[j+1])>0) {            //it will convert the string in unicode num//it will compare first word to next consecutive string
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
 */
