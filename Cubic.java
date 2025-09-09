import java.util.Scanner;
	public class Cubic{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number1:");
			int number1 = input.nextInt();
			System.out.print("enter a number2:");
			int number2 = input.nextInt();
			System.out.print("enter a number3:");
			int number3 = input.nextInt();
			System.out.print("enter a number4:");
			int number4 = input.nextInt();
			System.out.print("enter a number5:");
			int number5 = input.nextInt();
			System.out.print("enter a number6:");
			int number6 = input.nextInt();
			System.out.print("enter a number7:");
			int number7 = input.nextInt();
			System.out.print("enter a number8:");
			int number8 = input.nextInt();
			System.out.print("enter a number9:");
			int number9 = input.nextInt();
			System.out.print("enter a number10:");
			int number10 = input.nextInt();
// cubic
			int cubic1 = number1 * number1 * number1;
			int cubic2 = number2 * number2 * number2;
			int cubic3 = number3 * number3 * number3;
			int cubic4 = number4 * number4 * number4;
			int cubic5 = number5 * number5 * number5;
			int cubic6 = number6 * number6 * number6;
			int cubic7 = number7 * number7 * number7;
			int cubic8 = number8 * number8 * number8;
			int cubic9 = number9 * number9 * number9;
			int cubic10 = number10 * number10 * number10;
			
//square		int square1 = number1 * number1;
			int square2 = number2 * number2;
			int square3 = number3 * number3;
			int square4 = number4 * number4;
			int square5 = number5 * number5;
			int square6 = number6 * number6;
			int square7 = number7 * number7;
			int square8 = number8 * number8;
			int square9 = number9 * number9;
			int square10 = number10 * number10;
			System.out.printf( "number \t square  cube %n %d \t %d \t %d%n %d \t %d \t %d%n %d \t %d \t %d%n %d \t %d \t %d%n %d \t %d \t %d%n %d \t %d \t %d%n %d \t %d \t %d%n %d \t %d \t %d%n %d \t %d \t %d%n %d \t %d \t %d%n",number1,cubic1,square1,number2,cubic2,square3,number3,cubic3,square3,number4,cubic4,square4,number5,cubic5,square5,number6,cubic6,square6,number7,cubic7,square7,number8,cubic8,square8,number9,cubic9,square9,number10,cubic10,square10 );

}
}