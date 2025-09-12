import java.util.Scanner;
	public class Extract {
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.print("Enter a number between 0 and 1000: ");
			int num = input.nextInt();


			if( num <= 0 || num >= 1000){
			System.out.println("invalid number");}

			if(num > 0 & num < 1000){
			int num1 = num / 100;
			int num2 = (num % 100)/10;
			int num3 = (num % 10);
			int sum = num1 + num2 + num3; 
			System.out.printf( "The sum of the digits is %d %n",sum);}

			


}
}
			
			
			