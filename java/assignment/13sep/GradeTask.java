/*prompt  user and collect grade, save the grade collect.
use the assigned variable to ;
check if the input in  equal to letter A, and display "pass" when it is right, if not,
check if the input is equal to letter B,display  "pass" if not,
check if the input is equal to letter C,display  "pass" if not,
check if the input is equal to letter D,display  "pass" if not,
check if the input is equal to letter F,display  "fail" if not,
display "invalid letter".*/ 



import java.util.Scanner;
	public class GradeTask{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter your grade letters: ");
			String grade  = input.nextLine();

			if(grade .equalsIgnoreCase("A")){
				System.out.print("pass");
			}
			else if(grade .equalsIgnoreCase("B")){
				System.out.print("pass");;
			}
			else if(grade .equalsIgnoreCase("C")){
				System.out.print("pass");
			}
			else if(grade .equalsIgnoreCase("D")){
				System.out.print("pass");
			}
			else if(grade .equalsIgnoreCase("F")){
				System.out.print("fail")
			}
			else{
				System.out.print("invalid letter");
			}

	}	
			
		}