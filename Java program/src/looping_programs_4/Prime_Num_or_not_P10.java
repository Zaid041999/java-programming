package looping_programs_4;

public class Prime_Num_or_not_P10 {

	public static void main(String[] args) {
		int n = 7 ,temp=0;
		for(int i =2 ;i<=n-1;i++) {
			if(n%i==0) {
				temp = temp +1;
			}
		}
	/*	if(temp>0) {
			System.out.println("Not a prime num");
		}else {
			System.out.println("Prime num");
		}*/
		if(temp==0) {
			System.out.println(" Prime num");
		}else {
			System.out.println("Not a Prime num");
		}
	}

}
