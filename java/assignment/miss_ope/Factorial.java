/*Get a number from the user and store it.
Initialize two variables:
modulusum to 0. This will store the sum of the factorials of each digit.
tempnumber to the original number. This is a temporary variable we'll manipulate without changing the original number.
Loop as long as tempnumber is greater than 0:
Get the last digit of tempnumber using the modulus operator (% 10). 
Calculate the factorial of the last digit you just got. You can do this with a nested loop:
Initialize modulusmulti to 1.
Loop from 1 up to the last digit:
Multiply modulusmulti by the current loop counter.
Add the modulusmulti to modulusum.
Remove the last digit from tempnumber by dividing it by 10 and converting it to an integer.
After the loop finishes, check if modulusum is equal to the original number.
If they are equal, print a message saying the number is a "strong number."
If they are not equal, print a message saying the number is "not a strong number."*/





 import java.util.Scanner;
	public class Factorial{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number = input.nextInt();
			
			
			int modulus = 0;
			int tempnumber = number;
			int modulusmulti = 1;
			
			int modulusum = 0;
			
			while(tempnumber > 0){
				modulus = tempnumber % 10;
				
				while(modulus != 0){
					modulusmulti *= modulus;
					modulus--;
					
				}
								
				modulusum += modulusmulti;
				
				modulusmulti = 1;	
				tempnumber = tempnumber / 10;
			

			}

			if( modulusum == number){
				 
					System.out.printf("%d is a strong number",number);

				}
				else{
				System.out.printf("%d is a not strong number %n",number);
				}
		
		}

	}