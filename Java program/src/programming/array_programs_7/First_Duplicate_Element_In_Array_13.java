package programming.array_programs_7;

import java.util.HashSet;

public class First_Duplicate_Element_In_Array_13 {

	public static void main(String[] args) {
		/*int[] a = {6,5,3,2,5,2,4,7};
		int temp = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j] && i!=j) {
					temp =temp +1;
					System.out.println("The first duplicate element is : "+ a[i]);
					break;
				}
			}
			if(temp>0) {
				break;
			}
		}*/
		int[] a = {6,5,3,2,5,2,4,7};
		int temp =-1;
		HashSet <Integer> hs = new HashSet<>();
		for (int i = a.length-1 ; i >=0; i--) {
			if(hs.contains(a[i])) {
				temp=i;
			}else {
				hs.add(a[i]);
			}
		}
		if(temp!=-1) {
			System.out.println("The first duplicate element is :" +a[temp]);
		}else {
			System.out.println("Duplicate element not found");
		}
	}

}
