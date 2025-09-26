 import java .util.Scanner;
	public class LargestNumber{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter input: ");
			int number = input.nextInt();

			

			int count = 1;
			int largest = number;

			while(count < 10){
				System.out.print("enter input: ");
				number = input.nextInt();
		
				
				if(number > largest){
					largest = number;
				}
				count++;
			}
			
			System.out.println( "The largest number is " + largest);

		}

	}