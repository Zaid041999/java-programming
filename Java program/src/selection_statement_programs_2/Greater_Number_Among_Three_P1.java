package selection_statement_programs_2;
import java.util.Scanner;
public class Greater_Number_Among_Three_P1 {

	public static void main(String[] args) {
		//int a =10,b = 20,c=30;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		System.out.println("Enter the third number:");
		int c = sc.nextInt();
		/*if(a>b && a>c) {
			System.out.println("a is greater:" + a);
		}else if(b>a && b>c) {
			System.out.println("b is greater:" + b);
			
		}else {
			System.out.println("c is greater:" + c);
		}*/
		if(a>=b) {
			if(a>b && a>=c) {
				System.out.println("a is greater:" + a);
			}
			else if(c>a){
				System.out.println("c is greater:" +c);
			}
			else if(a==b && a==c && b==c) {
				System.out.println("a ,b and c are equal");
			}else if(a==b) {
				System.out.println("a and b are equal");
			}
			else if(a==c) {
				System.out.println("a and c are equal");
			}
			
		}else if(b>=c) {
			if(b>c) {
				System.out.println("b is greater:" + b);
			}else if(b==c) {
				System.out.println("b and c are equal");
			}
			else {
				System.out.println("c is greater:" + c);
			}
		}

	}

}
