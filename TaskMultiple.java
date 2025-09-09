import java.util.Scanner;
	public class TaskMultiple{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter an integer: ");
			int number = input.nextInt();
//multiples
			if(number % 6 == 0 ){
			System.out.printf(" %d is a multiple of 6 %n", number);
}
			if( number % 7 == 0){
			System.out.printf("%d is a multiple of 7 %n", number);
}
			

			if( number % 6 >= 1){
			System.out.printf("%d is not a muliple of 6 %n" , number);
}
			if( number % 7 >= 1){
			System.out.printf("%d is not a multiple of 7 %n ", number);
}
			
			
			
		

}
}