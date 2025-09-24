 import java .util.Scanner;
	public class SecondNumber{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter input: ");
			int number = input.nextInt();

			int count = 1;
			int largest = number;
			
			int second = 0;

			while(count < 10){
				System.out.print("enter input: ");
				int number = input.nextInt();
				
				if(number > largest){
					second = largest;
				
					largest  = number;
				}

				System.out.printf("second largest is %d and largest is %d", second , largest);

	}
		}