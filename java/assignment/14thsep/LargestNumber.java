 import java .util.Scanner;
	public class LargestNumber{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter input: ");
			int number = input.nextInt();

			System.out.println(number);

			int count = 0;
			int largest = number;

			while(count < 10){
				System.out.print("enter input: ");
				number = input.nextInt();
		
				System.out.println(number);
				if(number > largest){
					largest = number;
				}
				count++;
			}
			
			System.out.println(largest);

		}

	}