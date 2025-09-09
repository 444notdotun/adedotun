import java.util.Scanner;
	public class Future{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter investment amount: ");
			double investment = input.nextDouble();
			System.out.print("enter annual interest rate: ");
			double interest = input.nextDouble();
			System.out.print("enter number of years: ");
			double years = input.nextDouble();
			double form = years * 12 ;
			double a = (interest / 100) / 12 ;
			double solution =  Math.pow((1 + a) , form );
			double invest = investment * solution; 
			System.out.printf(" Accumulated value is $%" ,invest);



			



			


}


}