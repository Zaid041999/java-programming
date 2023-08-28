package Logical_Program_3;

public class Swap_Two_Num_Without_Third_Variable {

	public static void main(String[] args) {
		int a =10,b=20;
		a=a+b;           //a=10+20=30
		b=a-b;           //b=30-20=10
		a=a-b;           //a=30-10=20

		
		System.out.println("a is " +a);
		System.out.println("b is " +b);
}
}