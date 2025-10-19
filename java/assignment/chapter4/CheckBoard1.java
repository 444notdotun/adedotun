
public class CheckBoard1{
	public static void main(String [] args){
		int counter = 1;
		int counting = 1;
		int count = 1;
			while(count <= 4){

				while(counting <= 8){

					System.out.print("*");
					System.out.print(" ");
					if (counting == 8){
						System.out.println();
					}

					counting++;
				}

				

				while(counter <=8){
					System.out.print(" ");
					System.out.print("*");
					

					if (counter == 8){
						System.out.println();
					}
					counter++;
				}
				
				counting = 1;
				counter = 1;
				count++;
			}

			
		
		


	}
}		