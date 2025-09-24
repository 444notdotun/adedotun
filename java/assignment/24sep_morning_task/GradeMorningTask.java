 /* declare a variable (count) and initialize a value of 3 to it
declare  variable(sum) and initialize a value of 0 to it
use iteration condition that runs 3 times to ask user for score, save the score in a variable  and check if the score is;
1. greater than or equals to 0 and lesser than equals to 100, if not
enter a valid input, but if it is right , the addition of sum and count should be saved in variable sum, then;
 check if the score is greater than or equals to 90 and  if the score is les than or equals to 100, and display "the score  and the grade is A" if not
check if the score is greater than or equals to 80 and  if the score is less than  90, and display "the score  and the grade is B" if not,
check if the score is greater than or equals to 70 and  if the score is less than  80, and display "the score  and the grade is C", if not,
check if the score is greater than or equals to 60 and  if the score is less than  70, and display "the score  and the grade is D"if not,
display "the score and the grade is F"
when the condition exceeds 3 iteration, the cycle ends
reinitialize count to be 3 then display the result of sum divided by count. */




import java.util.Scanner;
	public class GradeMorningTask{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			
			int count = 0;
			int score = 0;

			while(count < 3){
			
			System.out.print("enter  score: ");
			int score1 = input.nextInt();
			score+=score1;
			count++;
			}
			score/=3;
			
			
			
				if(score >= 90 && score <= 100){
					System.out.printf("grade of average is A and the average score %d",score);
				}
				else if(score>= 80 && score < 90){
					System.out.printf("grade of average is B and the average score %d",score);
				}
				else if(score>= 70 && score < 80){
					System.out.printf("grade of average is C and the average score %d",score);
				}
				else if(score>= 60 && score < 70){
					System.out.printf("grade of average is D and the average score %d",score);
				}
				else{
					System.out.printf("grade of average is F and the average score %d",score);
				}

			
			

		}

	
}