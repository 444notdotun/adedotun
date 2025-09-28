import java.util.Scanner;
	public class Factorial{
		public static void main(String [] args){ 
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number =  input.nextInt();

		

			int count = number;
			
			int sum = 1;

			while(count > 0){
				sum *= count;
				count--;
			}

			System.out.print(sum);

}
}