package programming.array_programs_7;

import java.util.HashSet;

public class Common_Element_In_two_Array_15 {

	public static void main(String[] args) {
	/*	int [] a1= {5,4,6,3,1,2};
		int [] a2= {7,4,8,3,8,9};
		System.out.print("Common element in both the array:");
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i]==a2[j]) {
					System.out.print(a1[i]+" ");
					break;
				}
			}
		}*/
		int [] a1= {5,4,6,3,1,2};
		int [] a2= {7,4,8,3,8,9};
		
		HashSet <Integer > hs = new HashSet<>();
		System.out.print("Common element in both the array:");
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i]==a2[j]) {
					hs.add(a1[i]);
					break;
				}
			}
	}
		for(int no:hs) {
			System.out.print(no+" ");
		}
	}
}
