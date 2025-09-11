/*Prompt a user to collect a  digit from 0-9, save it in a variable, and use the assigned variable to;
Check if the input is greater than or equals to zero and less than or equals to 9, if not dislay invalid input,
then Check if the input is 0 display "zero" if not
Check if the input is 1 display "one" if not
Check if the input is 2, display " two" if not
Check if the input is 3, display "three "if not
Check if the input is 4, display "four"  if not
Check if the input is 5, display "five" if not
Check if the input is 6, display "six" if not
Check if the input is 7, display "seven" if not
Check if the input is 8, display "eight" if not
Check if the input is 9, display "nine "*/

import java.util.Scanner;
	public class Number{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a digit from (0-9): ");
			int score = input.nextInt();
			System.out.print(" ");
			if ( score  >= 0 && score <= 9){
				if(score == 0)
				System.out.print("ZERO");
				if(score == 1)
				System.out.print("ONE");
				if(score == 2)
				System.out.print("TWO");
				if(score == 3)
				System.out.print("THREE");
				if(score == 4)
				System.out.print("FOUR");
				if(score == 5)
				System.out.print("FIVE");
				if(score == 6)
				System.out.print("SIX");
				if(score == 7)
				System.out.print("SEVEN");
				if(score == 8)
				System.out.print("EIGHT");
				if(score == 9)
				System.out.print("NINE");
			}
			else{
				System.out.print("INVALID INPUT");
			}
		}
	}