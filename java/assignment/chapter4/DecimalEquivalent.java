import java.util.Scanner;
	public class DecimalEquivalent{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a binary number: ");
			int number = input.nextInt();

			int count = 0;
			int divide = number;
			
			while(divide > 0){
				divide = divide / 10;
				count++;

				
			}
			

			divide = 0;
			int sum = 0;
			int newsum = 0;
			while(count > 0){
				divide = number % 10;
				int counter = 1;
				while (counter <= count){
					divide *= 2;
					counter++;
				
				}
				count--;
				sum += divide;
				number = number / 10;
				System.out.println(sum);
				
			}
					
				
				
				
			



















		}
	}