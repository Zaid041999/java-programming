package selection_statement_programs_2;

public class Check_leapyear_P3 {
	 public static void main(String[] args) {
		 int y=2020;
		 //First method
		/* if(y%4==0) {
			 if(y%100==0) {
				 if(y%400==0) {
					 System.out.println("leap year");
				 }else {
					 System.out.println("Not a leap year");
				 }
			 }else {
				 System.out.println("leap year");
			 }
		 }else {
			 System.out.println("Not a leap year");
		 }*/
		 //Second method
		 if((y%400==0)||(y%4==0 && y%100!=0)) {
			 System.out.println("leap year");
		 }
		 else {
			 System.out.println("Not a leap year");
		 }
	}
}
