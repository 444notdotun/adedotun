import java .util.Scanner;
	public class Palindrome{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);

			System.out.print("enter a palindrome: ");
			int newnumber = input.nextInt();
			
			int lastnumbers = 0;
			int firstnumbers = 0;
			int lastnum1 =  0;
			int lastnum2 = 0;
			int firstnum1 = 0;
			int firstnum2 = 0;
			int count = 0;
		

			while(count < 1){

			if( newnumber >=10000 && newnumber <= 99999){
						
				
				
				
				lastnumbers = newnumber % 100;
				firstnumbers = newnumber / 1000;
				lastnum1 = lastnumbers % 10;
				lastnum2 = lastnumbers / 10;
				firstnum1 = firstnumbers % 10;
				firstnum2 = firstnumbers / 10;
				

				if( lastnum1 == firstnum2 && lastnum2 == firstnum1){
					System.out.print("it is a palindrome");
				}	
				else{
					System.out.print("it is not a palindrome");
				}
				count++;
			}
			
			else if (newnumber < 10000 || newnumber > 99999) {
				
				System.out.println("invalid value!(enter a 5 digit value)");
				System.out.print("enter a palindrome: ");
				newnumber = input.nextInt();
				
			}

			

			
			}


		}
	}