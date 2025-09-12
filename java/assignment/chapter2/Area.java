import java.util.Scanner;
	public class Area{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter point (x1: ");
			double x1 = input.nextDouble();

			System.out.print("enter point (x2:");
			double x2 = input.nextDouble();

			System.out.print("enter point (x3:");
			double x3 = input.nextDouble();

			System.out.print("enter point (y1:");
			double y1 = input.nextDouble();
			
			System.out.print("enter point (y2:");
			double y2 = input.nextDouble();

			System.out.print("enter point (y3:");
			double y3 = input.nextDouble();

// calculating sides
			double a = (x2 - x1) * (x2 - x1) + (y2 - y1)* (y2 - y1);
			double side1 = Math.sqrt(a);
			double b = (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2) ;
			double side2 = Math.sqrt(b);
			double c = (x1 - x3) * (x1 - x3) + (y1 - y3)  * (y1 - y3);
			double side3 = Math.sqrt(c);
			double s = (side1 + side2 + side3)/2;
// calculating area
			double d = s*(s - side1)*(s - side2)*(s - side3);
			double area = Math.sqrt(d);
			System.out.println("The area of the triangle is " + area);
}
}