/*prompt  user and collect a number, save the number collected.
use the assigned variable to ;
check if the number is less than  100 display "low".if not,
check if score is greater than or equals to 100 and less than or equals to 1000 display "medium",
if not, display High
*/ 



import java.util.Scanner;
	public class BankAccount{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter account balance: ");
			int balance = input.nextInt();

			if( balance < 100){
				System.out.print("LOW");
			}
			else if( balance >= 100 && balance < 1000){
				System.out.print("Medium");
			}
			else {
				System.out.print("High");
	
			}


		}		
	}