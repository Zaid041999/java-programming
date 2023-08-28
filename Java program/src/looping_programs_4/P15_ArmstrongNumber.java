package looping_programs_4;

public class P15_ArmstrongNumber {

	public static void main(String[] args) {
		/*int n =1634;
		int t1 = n;
		int length= 0;
		int rem;
		while(t1!=0) {
			length =length +1;
		    t1= t1/10;
		}
		int t2 = n;
		int arm =0;
		while(t2!=0) {
			int mul =1;
			rem   =t2%10;
			
			for(int i = 1 ;i<=length;i++) {
				mul = mul * rem;
			}
			arm = arm +mul ;
			t2=t2/10;
		}
		if(arm==n) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a armstrong number");
		}*/
		int n =1634;
		int t1 = n;
		int length= 0;
		int rem;
		while(t1!=0) {
			
		    t1= t1/10;
		    length =length +1; 
		}
		int t2 = n;
		int sum =0;
		while(t2!=0) {
			rem   =t2%10;
			
			sum  += Math.pow(rem,length);
			t2=t2/10;
		}
		if(sum==n) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a armstrong number");
		}
		
		
		/*
		int n =153;
	    int temp =n;
	    int rem,sum=0;
	    
	    while(n!=0) {
	    	rem = n%10;
	    	n=n/10;
	    	sum = sum + rem*rem*rem;
	    }
	    if(temp==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a armstrong number");
		}*/
	}

}
