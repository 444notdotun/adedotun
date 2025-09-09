import java.util.Scanner;
	public class Converts {
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter weight in pounds:");
			double weight = input.nextDouble();
			double a = weight * 0.454;
			System.out.printf(" %s pounds is %s kilograms",weight,a);
}
}