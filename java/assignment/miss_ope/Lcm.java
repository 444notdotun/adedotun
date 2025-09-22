import java .util.Scanner;
	public class Lcm{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number = input.nextInt();
	
			int count = 2;
			int solution = 0;
			int div = number; 

			while( div > 1){
				int nun = div % count;

				if( nun == 0 ){
					solution += count;
				
					div = div / count;
					
				}
				else {
			 		count++;
					
				}
						
				
			}
			
			System.out.println(solution);
			
}
}