package programming.array_programs_7;

public class Sum_Of_Array_1 {

	public static void main(String[] args) {
		int[] a = {10,20,30,40};
		int sum = 0;
		for(int i=0 ; i<a.length;i++) {
			 
			
				sum = sum +a[i]; 
	
			
		}
		System.out.println(sum);
	}

}

/*
 public static void main(String[] args) {
		int[][] a = {{10,20,30,40},{40,50}};
		int sum = 0;
		for(int i=0 ; i<a.length;i++) {
			
			for(int j =0;j<a[i].length;j++) {
				sum = sum +a[i][j]; 
			}
			
		}
		System.out.println(sum);
	}

 */
