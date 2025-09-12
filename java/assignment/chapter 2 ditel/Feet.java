
import java.util.Scanner;
	public class Feet{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a value for feet: ");
			double feet = input.nextDouble();
			double meters = feet * 0.305;
			System.out.printf( "%s feet is %s meters",feet,meters);
}
}