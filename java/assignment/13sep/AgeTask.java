/*prompt  user and collect age, save the age collect.
use the assigned variable to ;
check if the input in  equal to or greater than 0 and less than or equals to 12, and display "Child" when it is right, if not,
check if the input is greater than 13 and  lesser than or equal to 19,display  Teen" if not,
check if the input is greater than 20 and  lesser than or equal to 59,display  "Adult" if not,
check is the input is greater than or equals to 60*/



import java.util.Scanner;
	public class AgeTask{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter your age: ");
			int age = input.nextInt();
			


			if( age >= 0 && age <= 12 ){
				System.out.print("CHILD");
			}
			else if(age >= 13 && age <= 19){
				System.out.print("TEEN");
			}
			else if( age >= 20 && age <= 59){
				System.out.print("ADULT");
			}
			else if( age >= 60){
				System.out.print("ADULT");
			}

			else {
			System.out.print("invalid input");
			}

		}


	}


