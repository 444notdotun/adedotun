import java .util.Scanner;
	public class CreditLimt{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.print("account number: ");
			int accountnumber = input.nextInt();

			System.out.print("balance at the beginning of the month: ");
			int balance = input.nextInt();

			System.out.print("total items charged by the customer this month: ");
			int charges = input.nextInt();

			System.out.print("total of all credit applied to the customer's account this month: ");
			int credit = input.nextInt();

			System.out.print("allowed credit limit: ");
			int creditlimit = input.nextInt();
			
			int newbal = balance + charges - credit;

			if(newbal > creditlimit){
				System.out.print("credit limit exceeded");
			}
			else{
				System.out.print("credit  limit not exceeded");
			}
		}
	}
