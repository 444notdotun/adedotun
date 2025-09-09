import java.util.Scanner;
	public class TaskPrompt{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.print("enter an integer1: ");
			int number1 = input.nextInt();

			System.out.print("enter a type of operation: ");
			char  operation = input.next().charAt(0);

			System.out.print(" enter an integer2: ");
			int number2 = input.nextInt();
			
// print
			if( operation == '+' ){
			System.out.println (number1 + number2);
			}
		
			if( operation == '-' ){
			System.out.println(number1 - number2);
			}

			if( operation == '*' ){
			System.out.println(number1 * number2);
			}

			if( operation == '/' ){
			System.out.println(number1 / number2);
			}


		



}
}