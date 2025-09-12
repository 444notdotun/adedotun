import java.util.Scanner;
public class Arithmetic2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter integer:");
		int num1 = input.nextInt();
		System.out.print("enter integer:");
		int num2 = input.nextInt();
		System.out.print("enter integer:");
		int num3 = input.nextInt();
// sum
		int sum = num1+num2+num3;
//average
		int average = sum%3;
//product
		int product = num1*num2*num3;
//smallest
		int smallest = num1;
		if(num2 < smallest){
			 System.out.println(num2);
		}
		if(num3 < smallest){
			System.out.println(num3);
		}
//largest
		int largest = num2;
		if(num1 > largest){
			System.out.println(num2);
		}
		if(num3 > largest){
			System.out.println(num3);
		}
		System.out.println(average);
		System.out.println(sum);
		System.out.println(product);
}
}
