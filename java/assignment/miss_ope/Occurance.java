import java.util.Scanner;
	public class Occurance{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number = input.nextInt();

			int newnumber =  number % 10;
			

			int max = newnumber;
			int div = 1;
			
			int count = 0;
			int maxy =0;
			
			while(number > 0){
				newnumber = number % 10;
				
				if(newnumber > max){
					max = newnumber;
					count = 1;
				}
				

					if( newnumber == max){
						count++;
						//System.out.print(max);
					
				}	
			
				number = number / 10;
			}

			//System.out.println(max);
			System.out.print(count);
			
		}

	}