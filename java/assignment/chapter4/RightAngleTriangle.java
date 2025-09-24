import java.util.Scanner;
	public class RightAngleTriangle{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter the base of your triangle: ");
			int base = input.nextInt();

			String sum = "";
			String triangle = "*" ;

			
			for(int counter = 1; counter <= base; counter++){
				
				sum += triangle;
				System.out.println(sum);
			}
		
				























		}
	}