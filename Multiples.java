import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter whole number:");
		int a = input.nextInt();
		System.out.print("enter multiple number:");
		int b = input.nextInt();
		int triple = a*3;
		int doubled = b*2;

		int c = triple % doubled;
// multiples
		if(c <= 1){
			System.out.println("its a multiple of " + b);
		}
		if(c > 1){
			System.out.println("not a multiple");
		}
}
}
