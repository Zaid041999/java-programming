package looping_programs_4;

public class P13_Fibonacci_Series_Using_Recursion {
	static int a =0, b= 1,c;
	public static void main(String[] args) {
		System.out.print(a + " " + b);
		P13_Fibonacci_Series_Using_Recursion f = new P13_Fibonacci_Series_Using_Recursion();
		f.calfib(11);
	
	}
	public void calfib(int i ) {
	   if(i>=1) {
		   c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			calfib(i-1);
	   }
	}

}
