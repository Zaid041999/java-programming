package simple_program_1;

public class Sum_of_factornum_P8 {

	public static void main(String[] args) {
		int n =6;
		int sum =0;
		for(int i =1;i<=n;i++) {
			
			if(n%i==0) {
				
				sum =sum +i ;
			}
		}System.out.println(sum);
		

	}

}
