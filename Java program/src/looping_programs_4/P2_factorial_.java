package looping_programs_4;

import java.util.Scanner;

public class P2_factorial_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		//method1
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact= fact*i;
		}
		System.out.println("Factorial of "+  n  + " is " +fact);
		
		// method 2
		/*int n =5 ,fact =1;
		for(int i =n;i>=1;i--) {
			fact = fact * i;
			
		}
		System.out.println("Factorial of "+  n  + " is " +fact);*/

	}

}
