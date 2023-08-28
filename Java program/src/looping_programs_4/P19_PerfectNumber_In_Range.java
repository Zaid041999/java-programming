package looping_programs_4;

import java.util.Scanner;

public class P19_PerfectNumber_In_Range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first  number to start from : ");
		int n =sc.nextInt();
		System.out.print("Enter the last number : ");
		int n1=sc.nextInt();
		for(int i = n ;i<=n1;i++) {
			int sum =0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum = sum + j;
				}
			}
			if(sum==i) {
				System.out.println("Perfect numbers are :");
				System.out.println(i);
			}
		}
	}

}
