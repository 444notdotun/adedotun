 import java.util.Scanner;
	public class CommissionCalculator{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			int salary = 200;

			int cmd = 0;

			int answer = 0;
			double solution = 0;

			while( cmd >= 0){

				System.out.print("enter item sold(1-4): ");
				int item = input.nextInt();
				
				double percent = 0.09;
				
				double  num1 = 239.99;

				double  num2 = 129.75;

				double  num3 = 99.95;

				double  num4 = 350.89;
				
				double ninepercent = 0;

				if(item == 1){
					ninepercent = percent * num1;
				}
				else if(item == 2){
					ninepercent = percent * num2;
				}
				else if(item == 3){
					ninepercent = percent * num3;
				}
				else if(item == 4){
					ninepercent = percent * num4;
				}
					
				solution += ninepercent;
				
				
				System.out.print("include another item? (-1 to exit, 1 to continue): ");
				cmd = input.nextInt();
				
			}
			double payout = solution + salary;
			System.out.printf("salesperson payout for the week is %s",payout);





		}

	}
	