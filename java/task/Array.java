import java.util.Scanner;
public class Array{
	public static void main(String ... args){
	Scanner input = new Scanner(System.in);
	
	int [] scores =  new int [5];
	int count = 0;
	while (count  < 5){
		System.out.print("enter a number: ");
		scores [count] = input.nextInt();
		
		count++;
		if(count == 5){
		System.out.println("DONE COLLECTING!!!");}
	}
	count = 0;
	while(count < 5){
	System.out.print(scores[count]+ " ");
	count++;
}
	
	



}
}