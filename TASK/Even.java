import java.util.Scanner;
	public class Even{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter interger1 : ");
			int num1 = input.nextInt();	
			
			System.out.print("enter interger2 : ");
			int num2 = input.nextInt();	
			
			System.out.print("enter interger3 : ");
			int num3 = input.nextInt();
			
			System.out.print("enter interger4 : ");
			int num4 = input.nextInt();
			
			int odd1 = 0 ;
			int odd2 = 0 ;
			int odd3 = 0 ;
			int odd4 = 0 ;
		
			int even1 = 0 ;
			int even2 = 0 ;
			int even3 = 0 ;
			int even4 = 0 ;


			if(num1 % 2 == 1){
			odd1 = num1;} 
			else{ even1 = num1;}
			
			if(num2 % 2 == 1){
			odd2 = num2;} 
			else{ even2 = num2;}
		
			if(num3 % 2 == 1){
			odd3 = num3;} 
			else{ even3 = num3;}
		
			if(num4 % 2 == 1){
			odd4 = num4;} 
			else{ even4 = num4;}
		
			int sum = odd1 + odd2 + odd3 + odd4;
			int sumeven = even1 + even2 + even3 + even4;

			System.out.printf( "sum of even is  %d and odd is %d", sumeven , sum);
	
			



}
}