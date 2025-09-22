/*prompt  user for an input, and save in a variable
initilize variable count to  be 1 and save a variale solution to be 0
using while loop, solution holds the result of the arithmetic and it equals to the multiplication of number and count, and the condition should be less than or equals to 12.
display the number multiply by count equals to solution after iteration*/ 




import java.util.Scanner;
	public class CornFlakes{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number: ");
			int number = input.nextInt();
			
			int count = 1;
			
			int solution = 0;
			

			while(count <= 12){
				solution = number*count;
				System.out.printf("%d * %d = %d%n",number,count,solution);
				count++;
			}
			









}
}