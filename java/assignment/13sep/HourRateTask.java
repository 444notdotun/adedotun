/*prompt  user and collect hours worked and hourly rate, save the hour and  rate collected.
use the assigned variable to ;
to  multiply each other and save in a variable,
which gives the return pay,
check if the hour is greater than 40 , then multiply the return pay with 1.5,and save in a pay2 then display pay2 if not
display return pay*/ 



import java.util.Scanner;
	public class HourRateTask{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter your Hours worked: ");
			double hour = input.nextDouble();
			System.out.print("enter your Hourly rate: ");
			double rate  = input.nextDouble();


			double pay = hour * rate;
		
			if(hour >= 40){
				double pay2 = pay * 1.5;
				System.out.print( pay2);
			}
			else{
				System.out.print( pay);
			}
		}
	}



