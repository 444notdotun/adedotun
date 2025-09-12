import java.util.Scanner;
	public class Interest{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter balance: ");
			double balance = input.nextDouble();
			System.out.print("enter interest rate: ");
			double rate = input.nextDouble();
			double in =  rate / 1200;
			double interest = balance * in;
			System.out.printf("The interest is %.2f",interest); 
}
}