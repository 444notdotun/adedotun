 import java.util.Scanner;
	public class Reverse{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number = input.nextInt();
			
			
			int mod = 0;
			int div = number;
			int addmod = 0;
			while(div > 0){
				mod = div % 10;
				
												
				addmod += mod;
				System.out.print(addmod);
				addmod = 0;	
				div = div / 10;
			

			}
}
}
