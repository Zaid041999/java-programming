package Number_Conversion_5;

public class P7_Octal_To_Binary {

	public static void main(String[] args) {
		int n =14;
		int sum=0;
		int p =0;
		while(n!=0) {
			int rem = n % 10;
			sum = sum +rem*pow(8,p++);
			n=n/10;
		}System.out.println(bin(sum));
	}

	public static int pow(int n, int p) {
		int res =1;
		for(int i =1;i<=p;i++) {
			res = res*n;
		}
		return res;
	}
	//Decimal to binary
		public static String bin(int n)
		{
			String bin = "";
			while(n!=0)
			{
				int rem = n % 2;
				bin = rem + bin ;
				n = n/ 2;
				
			}
			return bin;
		}

}
