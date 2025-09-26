import java.util.Scanner;
	public class FactorialB{
		public static void main(String [] args){ 
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number =  input.nextInt();

		

			int count = number;
			int counter = number;
			double sum = 1;
			double total = 0;
			
			while(counter > 0){

				while(count > 0){
					sum *= count;
					count--;
					
					
				}
			
			total+=1/sum;

			
			
			sum = 1;
			counter--;
			count = counter;
			
			}
			

			System.out.print(1 + total);
		}
	}