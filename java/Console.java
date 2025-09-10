import java.util.Scanner;
	public class Console{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("what's your name?: ");
			String name = input.nextLine();
			

			System.out.print("How are you feeling today?(happy,sad,excited,tired): ");
			String mood = input.nextLine();
			
		
			System.out.print("do you want suggestion(yes/no)?");
			String suggest = input.nextLine();
			
			
			System.out.print("how old are you: ");
			int age = input.nextInt();
			
			System.out.print("it's your lucky day, guess between 1 and 10: ");
			int guess = input.nextInt();
			
			System.out.println(" ");
			
	
			
			System.out.printf("Hello,%s! Welcome to your personal assitant %n",name); 
			System.out.println(" ");
			

//mood and suggestion
			if( mood .equalsIgnoreCase("happy")){
			System.out.println("Keep smiling!");}
			else if ( mood.equalsIgnoreCase("sad")){
			System.out.println("cheer up!Tomorrow is a new day");}
			else if ( mood.equalsIgnoreCase("excited")){
			System.out.println("Awesome! Enjoy your energy");}
			else if ( mood.equalsIgnoreCase("tired")){
			System.out.println("Rest well and recharge!");}
			else{System.out.println("invalid input");}
			
			System.out.println(" ");

			if( suggest .equals("yes")){
				if( mood .equalsIgnoreCase("happy"))
				System.out.println("Go out and play a sport you like!");
				if( mood .equalsIgnoreCase("sad"))
				System.out.println("Take a short walk outside and get some fresh air.");
			 	if( mood .equalsIgnoreCase("excited"))
				System.out.println("Share your excitement by helping someone!");
				if( mood .equalsIgnoreCase("tired"))
				System.out.println("Have a short nap or rest to recharge.");
			}
			else {
				System.out.println("No worries! Have a great day anyway!"); 
			}

			System.out.println(" ");
			

//conditions on age		
			
			if(age < 13){
			System.out.printf("you are a young explorer! %n", name,age);
}
			if(age >= 13 ){
				if(age <= 19)
				System.out.printf("%Teen life is fun, enjoy it%n!", name, age );
			}
			if(age >= 20){
				if(age <= 59)
				System.out.printf("adulting can be challenging, stay strong! %n", name , age);
			}
			if(age >= 60){
			System.out.printf("Wisdom looks good on you! %n" ,name ,age);
			}
			
//guess condition


			System.out.println(" ");



			if( guess == 5){
			System.out.println("Wow! you guessed it!");
			}
			else{ System.out.println("aww,your are wrong,Try again next time!");
			}
}
}
