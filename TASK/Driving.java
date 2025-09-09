import java.util.Scanner;
public class Driving{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("enter the driving distance:" );
		double distance = input.nextDouble();
		System.out.print("enter miles per gallon:" );
		double miles = input.nextDouble();
		System.out.print("enter price per gallon:");
		double price = input.nextDouble();
		double cost = (distance/miles) * price;
		System.out.printf("The cost of driving is $%.1f",cost);

}
}
		