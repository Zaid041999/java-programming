package Pattern_6;

public class P7_Star_Pattern_7_RightTOleftDiagonal {

	public static void main(String[] args) {
		int n = 11;
		for(int i= 1;i<=n;i++) {
			for(int j =1;j<=n;j++) {
				if(i+j==n+1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
