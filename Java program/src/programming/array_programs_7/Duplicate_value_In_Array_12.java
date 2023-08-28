package programming.array_programs_7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate_value_In_Array_12 {

	public static void main(String[] args) {
		//Brute force method
		/*int[] a= {3,2,1,3,4,2};
		System.out.println("Duplicate elements in array");
		for (int i = 0; i < a.length; i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					System.out.print(a[j]+" ");
				}
			}
		}*/
		
		//Set Interface collection
		/*int[] a= {3,2,1,3,4,2};
		Set <Integer> h = new HashSet<>();
		System.out.print("Duplicate number in array :");
		for(int no :a) {
			
			if(h.add(no)==false) {
				System.out.print(no+" ");
			}
		}*/
		
		
		//Map
		int[] a= {3,2,1,3,4,2,3,3,3,3};
		Map <Integer,Integer> hm=new HashMap<>();
		for(int no : a) {
			Integer count= hm .get(no);
			if(count==null) {
				hm.put(no,1);
			}else {
				count+=1;
				hm.put(no, count);
			}
		
		}
		System.out.print("Duplicate elements are :");
		Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
		for(Map.Entry<Integer,Integer> me:es) {
			if(me.getValue()>1) {
				System.out.print(me.getKey()+" ");
			}
		}
	}

}
