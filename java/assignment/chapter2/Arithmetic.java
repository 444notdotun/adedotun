import java.util.Scanner;
public class Arithmetic {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("enter an integer:");
int x =input.nextInt();
System.out.print ("enter an integer:");
int y = input.nextInt();
// square of the value 
int square1 = x*x;
int square2 = y*y;
//sum of their square
int sum  = square1 + square2;
//difference of their square
int dif  = square1 - square2;
System.out.printf(" The sum is %d%n and diffrence is %d%n",sum,dif);
}
}

