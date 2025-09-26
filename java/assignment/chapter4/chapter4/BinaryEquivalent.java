/*prompt user for an input and saave the input as number
use count as a container holding value 1
use multiple as a container holding value 0
use modulus as a container holding value 0
use total as a container holding value 0
modulate division by 10 , multiply it  with the value of count , add the mutiplied value to total and divide division with 10, increment by 2, do this in every iteration until division is 0 and terminate the loop
print total.*/



import java.util.Scanner;
	public class BinaryEquivalent{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter input in binary: ");
			int number = input.nextInt();

			int count = 1;
			int multiple = 0;
			int modulus = 0;
			int total = 0;
			int division = number;


				while(division != 0){
					modulus = division % 10;
					multiple = modulus * count;

					total+=multiple;

					division = division / 10;
					count+=2;
				}
			System.out.print(total);
					

		}

		


	}