package simple_program_1;

public class Print_1To50_without_loop_P1 {
	public static void demo(int n) {
		if(n<=50) {
			System.out.println(n);
			demo(++n);
		}

	}
	public static void main(String[] args) {
		System.out.println("MB");
		demo(1);
		System.out.println("ME");
	}

}
