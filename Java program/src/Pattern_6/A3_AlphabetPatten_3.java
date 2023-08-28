package Pattern_6;

public class A3_AlphabetPatten_3 {

	public static void main(String[] args) {
		int n =5;
		int alpha = 65;
		for(int i =1;i<=n ;i++) {
			for(int j = 1;j<=n;j++) {
				if(i>=j) {
					System.out.print((char)(alpha)+" ");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			alpha =alpha+1;
		}

	}

}
