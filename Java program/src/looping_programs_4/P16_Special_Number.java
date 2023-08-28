package looping_programs_4;

public class P16_Special_Number {

	public static void main(String[] args) {
		int n = 19;
		int temp = n;
		int sum = 0;
		int prod = 1;
		while (n!=0) {
			int rem = n %10;
			sum = sum +rem;
			prod =prod * rem;
			n = n/10;
		}
		sum =sum +prod;
		if(temp==sum) {
			System.out.println(temp +" Number is a special number");
		}else {
			System.out.println(temp +" Number is not a special number");
		}
	}

}
//19=(1+9)+(1*9)=19(original num)
   //(sum of num)+(product of number)=origunal number