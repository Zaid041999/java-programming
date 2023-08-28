package programming.array_programs_7;

public class Product_Of_Array_2 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6}};
		int prod = 1;
		for(int i =0;i<a.length;i++) {
			for(int j =0 ;j<a[i].length;j++) {
				prod =prod *a[i][j];
			}
		}
		System.out.println(prod);
	}

}
/*
 public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int prod = 1;
		for(int i =0;i<a.length;i++) {
			prod = prod * a[i];
		}
		System.out.println(prod);
	}
 */
