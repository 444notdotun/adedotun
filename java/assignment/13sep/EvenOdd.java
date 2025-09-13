/*prompt  user and collect input, save the input collected.
use the assigned variable to ;
module the input by 2 and save  with  variable remainder
check if the remainder  is 0  then check if input its negative ,display "negative even" else positive even" if not,
check if the remainder  is greater than or equals 1 then check if its negative ,display "negative odd" else positive odd" */ 



import java.util.Scanner;
	public class EvenOdd{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number = input.nextInt();

			
			
			int remainder = number % 2;

			if(remainder == 0){
				if(number < 0 )
					System.out.print("negative even");
				else
					System.out.print("positive even");
			}


			if(remainder < 0 || remainder >= 1 ){
				if(number < 0 )
					System.out.print("negative odd");
				else
					System.out.print("positive odd");
			}
		}
	}