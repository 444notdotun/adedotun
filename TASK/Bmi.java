import java.util.Scanner;
	public class Bmi {
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter weight in kilograms:");
			double weight = input.nextDouble();
			System.out.print("enter height in meters:");
			double height = input.nextDouble();
			double bmi = weight / (height * height);

			System.out.printf(" your BMI is %s%n BMI category \t BMI range %n Underweight \t below 18.5 %n Healthy \t 18.5-24.9 %n Overweight \t 25.0-29.9 %n Obesity \t 30.0 or above" , bmi);


}
}
