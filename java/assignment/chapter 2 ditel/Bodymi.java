import java.util.Scanner;
	public class Bodymi {
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter weight in pounds:");
			double weight = input.nextDouble();
			System.out.print("enter height in inches:");
			double height = input.nextDouble();
			double bmi = weight * 703 / (height * height);

			System.out.printf(" your BMI is %s%n" , bmi);


}
}
