/* prompt user for 3 inputs and save them as (input1, input2,input3)
resave one of the numbers to be compared to  others to determine the largest number.
check if the first value is greater than the resave value, print the number as the highest, if not,
check if the third value is grater than the resaved value , print the number , if not, 
print second value as the highest








import java.util.Scanner;
	public class LargestNumber{
		public static void main(Strings[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter number one: ");
			int input1 = input.nextInt();
			System.out.print("enter number two: ");
			int input2 = input.nextInt();
			System.out.print("enter number three: ");
			int input3 = input.nextInt();
			

			int largest = input2


			if(input1 > largest){
			largest = input1;
			System.out.printf("The largest is %d",input1);
			}

			if(input3 > largest){
			largest = input3;
			System.out.printf("The largest is %d",input3);
			}

			else{
			System.out.printf("The largest is %d",input2);
			}

  

		}

	}