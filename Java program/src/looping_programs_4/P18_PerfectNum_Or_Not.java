package looping_programs_4;

import java.util.Scanner;

public class P18_PerfectNum_Or_Not {

	public static void main(String[] args) {
     		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum = 0;
		for(int  i = 1;i<n;i++) {
			if(n%i==0) {
				sum =sum + i;
			}
		}
		if(sum==n) {
			System.out.println("perfect number");
			
		}else {
			System.out.println("Not a perfect number");
		}
		

	}

}
//6= 1 + 2 + 3=6  it is a perfect number
//  (6%1==0)+ (6%2==0)+ (6%3==0)=6
//the number which is fully divisible
