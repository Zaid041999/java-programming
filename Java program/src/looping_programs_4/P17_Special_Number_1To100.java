package looping_programs_4;

public class P17_Special_Number_1To100 {

	public static void main(String[] args) {
	for(int i=1;i<=100;i++) {
		int sum =0;
		int prod=1;
		int temp =i;
		while(i!=0) {
			int rem = i%10;
			sum =sum + rem ;
			prod =prod *rem;
			i = i /10;
		}
		sum =sum + prod;
		if(sum==temp) {
			System.out.println(sum);
		}
		i=temp;
	}

	}

}
