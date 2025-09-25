import java.util.Scanner;
	public class SpecifiedSum{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a specified number: ");
			int number = input.nextInt();


			int count = 1;
			int sum = 0;

			while(count > 0){

				System.out.print("enter a number: ");
				int newnumber = input.nextInt();

				sum+=newnumber;
				
				if(sum >= number){
					count--;
				}
			}
			
			System.out.printf("The sum of numbers is %d", sum);
































		}
	}