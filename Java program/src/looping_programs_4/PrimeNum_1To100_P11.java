package looping_programs_4;

public class PrimeNum_1To100_P11 {

	public static void main(String[] args) {
		//method 1
		/*for(int i =1 ;i<=100;i++) {
			int temp =0 ;
			for (int j =2;j<=i-1;j++) {
				if(i%j==0) {
					temp = temp +1;
				}
			}
			if(temp==0) {
				System.out.println(i);
			}
		}*/
		
		//method 2
		 int temp =0;
		 for(int i =1;i<=100;i++) {
			 for(int j =2 ;j<=i-1;j++) {
				 if(i%j==0) {
					 temp = temp + 1;
				 }
			 }
			 if(temp==0) {
				 System.out.println(i);
			 }
			 else {
				 temp = 0;
			 }
		 }
	}

}
