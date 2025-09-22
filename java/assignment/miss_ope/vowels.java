import java .util.Scanner;
	public class vowels{
		public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number: ");
		String letter = input.nextLine();
		
		if(letter .equalsIgnoreCase("A")|| letter .equalsIgnoreCase("E")||letter .equalsIgnoreCase("I")||letter .equalsIgnoreCase("O")||letter .equalsIgnoreCase("U")){
			System.out.print(letter + " " +"is a vowel");

		}
		else{
			System.out.print(letter +" " +"is a consonant");
		}


}
}