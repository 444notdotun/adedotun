


import java.util.Scanner; 
	public class MultipleLoop{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int a = input.nextInt();

			int b = 0;
			
			for(int count = 1; count <= a; count ++){
                    	b += a ;

				System.out.println(b);
			}

			
			
			
	}
	}