import java.util.Scanner;
	public class Task{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("input value a: " );
			int a = input.nextInt();
			System.out.print("input value b: " );
			int b = input.nextInt();
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("a = " + a );
			System.out.println("b = " + b);		
			  
}
}
