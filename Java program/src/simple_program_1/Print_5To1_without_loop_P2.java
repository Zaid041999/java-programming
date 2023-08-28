package simple_program_1;

public class Print_5To1_without_loop_P2 {
	public static void demo(int n) {
		if (n>=1) {
			System.out.println(n);
			demo(--n);
		}
	}
	public static void main(String[] args) {
		System.out.println("MB");
		demo(5);
		System.out.println("ME");
	}

}
