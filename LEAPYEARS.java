import java.util.Scanner;

public class LEAPYEARS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /* int day = 366;
      int year =2000;
       if(day== 366 && year % 4 == 0) {
    	   System.out.println("given day or year is leap year ");
       }
       else {
    	   System.out.println("given day or year is not leap year");
       }*/
		int year;
		Scanner Sc =new Scanner(System.in);
		System.out.println(" Enter the year");
		 year =Sc .nextInt();
		if(((year % 4 == 0 ) && (year % 100 !=0 ) || (year % 400 == 0))) {
        System.out.println("year is leap year");
       }
		else {
			System.out.println("year is not leap year");
		}
	}
}
	


