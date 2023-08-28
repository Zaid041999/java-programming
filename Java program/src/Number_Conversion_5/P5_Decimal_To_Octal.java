package Number_Conversion_5;

public class P5_Decimal_To_Octal {

	public static void main(String[] args) {
		String bin="";
		int n = 15;
		while (n!=0) {
			int rem = n%8;
			bin = rem + bin;
			n= n /8;
		}
		System.out.println(bin);
	}

}
