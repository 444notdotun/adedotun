import java.util.Scanner;
	public class Values{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter a number1:");
			int number1 = input.nextInt();
			System.out.print("enter a number2:");
			int number2 = input.nextInt();
			System.out.print("enter a number3:");
			int number3 = input.nextInt();
			System.out.print("enter a number4:");
			int number4 = input.nextInt();
			System.out.print("enter a number5:");
			int number5 = input.nextInt();
			

// negative
			
			if(number2 < 0){
			System.out.printf("number %d is negative %n",number2);}
			if(number1 < 0){
			System.out.printf("number %d is negative %n",number1);}
			if(number3 < 0){
			System.out.printf("number %d is negative %n",number3);}
			if(number4 < 0){
			System.out.printf("number %d is negative %n",number4);}
			if(number5 < 0){
			System.out.printf("number %d is negative %n",number5);}

//positive

			if(number2 > 0){
			System.out.printf("number %d is positive %n",number2);}
			
			if(number3 > 0){
			System.out.printf("number %d is positive %n",number3);}
	
			if(number1 > 0){
			System.out.printf("number %d is positive %n",number1);}
			
			if(number4 > 0){
			System.out.printf("number %d is positive %n",number4);}

			if(number5 > 0){
			System.out.printf("number %d is positive %n",number5);}

//zero
			if(number2 == 0){
			System.out.printf("number %d is zero %n",number2);}
			if(number1 == 0){
			System.out.printf("number %d is zero %n",number1);}
			if(number3 == 0){
			System.out.printf("number %d is zero %n",number3);}
			if(number4 == 0){
			System.out.printf("number %d is zero %n",number4);}
			if(number5 == 0){
			System.out.printf("number %d is zero %n",number5);
			}











}
}