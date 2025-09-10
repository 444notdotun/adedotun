import java.util.Scanner;
	public class Task{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("input value a: " );
			int a = input.nextInt();
			System.out.print("input value b: " );
			int b = input.nextInt();
			System.out.println("a = " + ( (a + b)-a));
			System.out.println("b = " + ( (a + b)-b));		
			  
}
}
