/*Prompt a user to collect 3 sides of a triangle, save them in variables (a,b,c).
Check if  side a is equal to side b  and if side b is equal to side c, display (equilateral) if not,
Check if side a is equal to b or side b is equal to c or side a is equal to c, display isosceles if not
Display scalene*/



import java.util.Scanner;
	public class SidesOfTriangle{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter side1: ");
			int a = input.nextInt();
			System.out.print("Enter side2: ");
			int b = input.nextInt();
			System.out.print("Enter side3: ");
			int c = input.nextInt();
			System.out.print(" ");
			if(a == b && a == c){
				System.out.print("equilateral");
			}
			else if(a == b || a == c || b == c){
				System.out.print("isosceles");
			}
			else{
				System.out.print("Scalene");

			}
		}
	}



