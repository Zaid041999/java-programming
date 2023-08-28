package simple_program_1;

import java.util.Scanner;

public class Sum_of_all_even_num_p5 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1;i<=10;i++) {
			if(i%2==0) {
				sum = sum +i;
			}
		}
		System.out.println(sum);
	
	}
	/*public static void even(int n) {
		int sum = 0;
		for(int i =1;i<=10;i++) {
			if(i%2==0) {
				sum = sum +i;
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		even(n);

	}*/

}
