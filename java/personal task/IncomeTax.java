import java .util.Scanner;
	public class IncomeTax{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter taxable income: ");
			double income = input.nextDouble();
			System.out.printf("enter filling status,where single = 0 married filling jointly = 1 married filling sep = 2 head of house = 3: " );
			Double filing = input.nextDouble();	

				

			if(filing == 0  && income <= 8350){
			double a = (10.0/100.0)* income;
			double incometax = a;
			System.out.print("income tax is %s",incometax);
			}
			if(filing == 0  && income >= 8351){
			  if(income <=33950
			
}	
}