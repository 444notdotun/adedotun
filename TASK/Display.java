import java.util.Scanner;
	public class Display{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print( " enter the number of minutes: ");
			int number = input.nextInt();
			int years =  number / 525600;
			int days =  number / (24 *60) - (years * 365) ;
			System.out.printf( "%d minutes is approximately %d and %d days", number,years,days);
}
}