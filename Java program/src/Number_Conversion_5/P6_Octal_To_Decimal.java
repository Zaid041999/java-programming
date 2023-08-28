package Number_Conversion_5;

public class P6_Octal_To_Decimal {
	public static void main(String[] args) {
		int n =14;
		int sum=0;
		int p =0;
		while(n!=0) {
			int rem = n % 10;
			sum = sum +rem*pow(8,p++);
			n=n/10;
		}System.out.println(sum);
	}

	public static int pow(int n, int p) {
		int res =1;
		for(int i =1;i<=p;i++) {
			res = res*n;
		}
		return res;
	}
	
}
