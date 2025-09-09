import java.util.Scanner;
	public class IncreasesPay{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter score: ");
			int score = input.nextInt();
// 30% increase
			double a = 3.0 / 100.0;
			double pay = a * score;
// 10% increase
			double b = 1.0 / 100.0;
			double d = b * score;

			if(score > 90){
			double conc = pay + score;
			
			System.out.println("increase of 30% on pay is " + pay);
			} 
			else{
			double conc = d + score;
			System.out.println("increase 0f 10% on pay is  " +  conc);
			} 
}
}