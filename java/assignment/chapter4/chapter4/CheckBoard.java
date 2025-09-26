
public class CheckBoard{
	public static void main(String [] args){
		 int count = 1;
		while(count > 0){
			System.out.println();
			int counter = 1;
			int counting = 1;
			while(counter <= 8){
				System.out.println();
				while(counting <= 8){
					System.out.print("*");
					counting++;	
				}
			
			System.out.print(" ");
			System.out.print("* ");
			counter++;
			}
		count--;
		}
		


	}
}		