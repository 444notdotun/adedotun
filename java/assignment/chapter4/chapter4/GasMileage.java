/*prompt user for gallon used in each trip and 0 to end the program, save in the input as gallon
prompt user for miles used in each trip and save it in the input as miles.
 save variable count to 0
while usuing iteration the condition should be gallon greater than 0 in the body of the iteration,*/






import java .util.Scanner;
	public class GasMileage{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			int gallon = 0;

			int miles = 0;
					
			int count = 0;
			double trips = 0;
			int choice = 1;
 
			while(choice != 0){

				System.out.print("enter gallon used in a trip: ");
				gallon = input.nextInt();
				System.out.print("enter miles used in a trip: ");
				miles = input.nextInt();
				
				
				double  gasmileage = gallon / miles;
			 	trips += gasmileage;

				count++;

				System.out.print("do you want continue?, 0 to exit & any number to continue: ");
				 choice = input.nextInt();
			}
			
				System.out.printf ("for %d  trips this is the total gas mileage %s ",count,trips);


			


		}
	}


