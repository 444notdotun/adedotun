import java.util.Scanner;
	public class Acceleration{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter the value for V0:");
			double v0 = input.nextDouble();
			System.out.print("enter the value for v1:");
			double v1 = input.nextDouble();
			System.out.print("enter the value for t:");
			double t = input.nextDouble();
			double a = (v1 - v0) / t;
			double d = v0 - v1;
			System.out.println("The average acceleration is" + a);

}
}
