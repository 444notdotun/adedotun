/*prompt  user and collect attendance worked and score, save the score and  attendance collected.
use the assigned variable to ;
check if the percentage is greater than or equals to 75 and check if score is greater than or equals to 75 , then display "eligible, if not
display not eligible*/ 



import java.util.Scanner;
	public class EligiblilityTask{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter attendance percentage(%): ");
			int attendance = input.nextInt();
			System.out.print("enter your average score: ");
			int score  = input.nextInt();

			if(attendance >= 75){
				if( score >= 75)
				System.out.print("Eligible"); 
				else 
				System.out.print("Not eligible");

			}
			else {
				System.out.print("Not eligible");
			}
		}
	}