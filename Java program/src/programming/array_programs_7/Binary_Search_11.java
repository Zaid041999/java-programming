package programming.array_programs_7;

import java.util.Arrays;

public class Binary_Search_11 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10,11};
		//Arrays.sort(a); //to sort array if not sorted
		int search =6;
		int li =a[0];
		int hi = a.length-1;
		int mi = (li+hi)/2;
		while(li<=hi) {
			if(a[mi]==search) {
				System.out.println("Element is present at "+ mi + " index position");
				break;
			}else if (a[mi]<search) {
				li=mi+1;
			}else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("Element is not present");
		}
	}

}
