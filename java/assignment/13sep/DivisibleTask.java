/*prompt  user and collect input, save the input collected.
use the assigned variable to ;
module the input by 5 and save  in a variable rem5
module the input by 3 and save  in a variable rem3
check if its rem3 and rem5  ,display "divisible by both" 
check if  display "not divisible"
check if the rem3  is 0  display "divisible by 3" if not,
check if the rem5 is 0 display "divisible by 5"   if not,
*/ 



import java.util.Scanner;
	public class DivisibleTask{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number = input.nextInt();

			int rem3 = number % 3;
			int rem5 = number % 5;


			if( rem3 == 0 && rem5 == 0 ){
				System.out.println("Divisible by both");
			}
			else if(rem3 != 0 && rem5 != 0){
				System.out.println("Not divisible");
			}


			else if( rem3 == 0){
				System.out.println("Divisible by 3");
			}
			
			else if( rem5 == 0){
				System.out.println("Divisible by 5");
			}

		}
	}

