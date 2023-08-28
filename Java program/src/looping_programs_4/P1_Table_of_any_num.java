package looping_programs_4;

import java.util.Scanner;

public class P1_Table_of_any_num {

	public static void main(String[] args) {
		// method 1
		/*int t = 2;
		for(int i = 1; i<=10;i++) {
			System.out.println(t*i);
		}*/
		//method 2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number");
		int t = sc.nextInt();
		for(int i =1 ;i<=10;i++) {
			System.out.println(t + "*" + i + "=" + t*i);
		}

	}

}
