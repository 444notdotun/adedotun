import java.util.Scanner;
public class CompareInteger{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("enter a value:");
		int value = input.nextInt();
		int square = value * value;
// greater than
		if( value > 100){
			System.out.println(value + " > 100");
		}
		if(square > 100){
			System.out.println(square +" > 100");
		}
// equal too
		if(value == 100){
			System.out.println(value + " == 100 ");
		}
		if (square  == 100){
			System.out.println(square + " == 100 ");
		}
// NOT EQAUL TO
		if(value != 100){
			System.out.println(value +" !=100 ");
		}
		if (square  != 100){
		 	System.out.println(square + " != 10 ");
		}
// less than
		if(value < 100){
			System.out.println(value + " < 100 ");
		}
		if(square < 100){
			System.out.println(square + " < 100 ");
		}



}

}
