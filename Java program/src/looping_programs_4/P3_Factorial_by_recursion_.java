package looping_programs_4;

import java.util.Scanner;

public class P3_Factorial_by_recursion_ {
	static int fact =1;
	public void calfactorial(int n) {
		if(n>1) {
			fact =fact *n;
			calfactorial(n-1);
		}
	}
	public static void main(String[] args) {
		//int n =5;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to find out the factorial :");
		int n = sc.nextInt();
		P3_Factorial_by_recursion_ f= new P3_Factorial_by_recursion_();
		f.calfactorial(n);
		System.out.println("Factorial of num "+  n  +" is "+ fact);
	}

}
