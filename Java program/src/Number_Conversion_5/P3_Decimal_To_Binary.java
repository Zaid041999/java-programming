package Number_Conversion_5;

public class P3_Decimal_To_Binary {

	public static void main(String[] args) {
		int n = 8;
		String bin ="";
		while(n!=0) {
			int rem = n%2;
			bin = rem+bin;
			n = n/2;
		}
		System.out.println(bin);

	}

}
