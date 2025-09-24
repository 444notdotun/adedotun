import java.util.Scanner;
	public class Occurance{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number = input.nextInt();

			int newnumber =  number % 10;
			

			int largest = newnumber;
			int div = 5 ;
			
			int count = 0;
			
			while(div > 0){
				
				newnumber = number % 10;
				if(newnumber > largest){
					largest = newnumber;
					System.out.print(newnumber);}
					
					if( newnumber == largest){
						count++;}
					
				//div = number / 10;
div--;
			}

			//System.out.println(count);


		
			

		}

	}