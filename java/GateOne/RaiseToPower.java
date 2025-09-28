import java.util.Scanner;
	public class RaiseToPower{
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number");
		int numberone = input.nextInt();
		System.out.print("enter the raise to power");
		int numbertwo = input.nextInt();
int count = 0; 
int sum = 1;
while (count < numbertwo){
sum *=numberone;
count++;
}

System.out.print(sum);












	}

}