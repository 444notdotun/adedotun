import java.util.Scanner;
public class Testing{
	public static void main(String ... args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number: ");
		int number = input.nextInt();
		int max = number;
		int secoundnumber = 0;
		int count = 0;
		while (count < 4){
			System.out.print("enter a number: ");
			number = input.nextInt();
			
			if (number > max){
				secoundnumber = max;
				max = number;
	
			}
			if(number < max && number > secoundnumber){
				secoundnumber = number;
}
		count++;
		}
	System.out.println(max);
	System.out.print(secoundnumber);
	}
}
