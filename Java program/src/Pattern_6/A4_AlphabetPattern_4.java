package Pattern_6;

public class A4_AlphabetPattern_4 {

	public static void main(String[] args) {
		int alpha =65;
		int n =5;
		for(int i =1; i<=n;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print((char)(alpha)+" ");
				alpha = alpha +1;
			}
			System.out.println();
		}

	}

}
