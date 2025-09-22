/*prompt the user to enter a number.
Store the number the user entered. Let's call this number.
Create a temporary variable, let's call it tempnumber, and set it equal to number.
Create another variable to keep track of the sum, let's call it sum, and set it to 0.
Start a loop that continues as long as tempnumber is greater than 0. This loop processes each digit of the number.
a.  Get the last digit of tempnumber. You can do this by finding the remainder when tempnumber is divided by 10.
b.  Calculate the fourth power of digit.
c.  Add this result to sum.
d.  Remove the last digit from number by dividing it by 10 and keeping only the integer part.
After the loop finishes, tempnumber will be 0.
Compare sum with the number.
a.  If they are equal, display a message that says the number is an Armstrong number.
b.  If they are not equal, display a message that says the number is not an Armstrong number.*/





 import java.util.Scanner;
	public class Armstrong{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number = input.nextInt();
			
			
			int mod = 0;
			int tempnumber = number;
			int modsum = 1;
			int count = 1;
			int sum = 0;
			
			while(tempnumber > 0){
				mod = tempnumber % 10;
				
				while(count != 4){

					modsum *= mod;

					count++;
											
				}
				sum += modsum;
				
				modsum = 1;
				count = 1;	
				tempnumber = tempnumber / 10;
			
				
			}

			if( sum == number){
				 
					System.out.printf("%d is a armstrong number",number);

				}
				else{
				System.out.printf("%d is a not armstrong number %n",number);
				}
		
		}

	}