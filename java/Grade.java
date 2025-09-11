/*prompt  user and collect a numerical score, save the score in a variable.
use the assigned variable to ;
check if the input in greater than or equal to 90, and display "A" when it is right, if not,
check if the input is greater than 80 and  lesser than 89,display  "B" if not,
check if the input is greater than 70 and  lesser than 79,display  "C" if not,
check if the input is greater than 60 and  lesser than 69,display  "D" if not,
display "F"*/



import java.util.Scanner;
	public class Grade{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a numerical score: ");
			int score = input.nextInt();
			if(score >= 90){
				System.out.print("A");
			}
			else if(score >= 80 && score <= 89){
				System.out.print("B");
			}
			else if(score >= 70 && score <= 79){
				System.out.print("C");
			}
			else if(score >= 60 && score <= 69){
				System.out.print("D");
			}
			else{
				System.out.print("F");
			}

		}
	}