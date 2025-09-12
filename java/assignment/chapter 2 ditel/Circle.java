import java.util.Scanner; 
	public class Circle{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a radius:");
			int radius = input.nextInt();
			System.out.printf("%d%n",2 * radius);
			double a = 3.14159f;
//circumference 
			System.out.println( 2*a*radius);
//area
			System.out.println( a*radius*radius);

}
}
