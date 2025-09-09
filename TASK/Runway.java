import java.util.Scanner;
	public class Runway{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
 
			System.out.print("Enter speed in (m/s): ");
			double speed = input.nextDouble();
	
			System.out.print("Enter acceleration in(m/s)^2: ");
			double acc = input.nextDouble();

			double velocity = speed * speed;
			double length = velocity / (2 * acc);
			System.out.printf("The minimum runway length for this airplane is %.3f",length);
}
}