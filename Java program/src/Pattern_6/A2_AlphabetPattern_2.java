package Pattern_6;

public class A2_AlphabetPattern_2 {

	public static void main(String[] args) {
		int n =5;
		int alpha =65;
		int temp =alpha;
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				if(i>=j) {
					System.out.print((char)(alpha) + " ");
					alpha = alpha+1;
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			alpha = temp;
		}

	}

}
