import java.util.Scanner;
	public class Console{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			
			System.out.print("what's your name?: ");
			String name = input.nextLine();
			System.out.println(" ");

			System.out.print("How are you feeling today?(happy,sad,excited,tired): ");
			String mood = input.nextLine();
			System.out.println(" ");
		
			System.out.print("do you want suggestion?");
			String suggest = input.nextLine();
			System.out.println(" ");
			
			System.out.print("how old are you: ");
			int age = input.nextInt();
			System.out.println(" ");

			System.out.println(" ");
			System.out.print("it's your lucky day, guess between 1 and 10: ");
			int guess = input.nextInt();
			

			
	
			
			System.out.printf("Hello,%s! Welcome to your personal assitant %n",name); 
			System.out.println(" ");
			

//mood and suggestion
			

			

			if(mood .equals ("happy")){
			System.out.printf("you're %s,cheer up! Keep smilimg! %n", mood);
				if( suggest .equals( "yes")) 
				System.out.println("here is a suggestion for the day: go out and play a sport you like!");	
					if(!suggest .equals("yes"))
				System.out.println("no worries! have a great day anyway!");
			}
		
			
			if(mood .equals ("sad")){
			System.out.printf("you're %s,cheer up! Tomoorow is a new day.%n", mood);
				if( suggest .equals ("yes")) 
				System.out.println("here is a suggestion for the day: take a short walk outside and get some fresh air!");
					if(!suggest .equals("yes"))
				System.out.println("no worries! have a great day anyway!");
			}
		
			if(mood .equals ("excited")){
			System.out.printf("you're %s,Awesome! Enjoy your energy! %n", mood);
				if( suggest .equals(" yes")) 
				System.out.println("here is a suggestion for the day: and share your excitment by helping somone!");
					if(!suggest .equals("yes"))
				System.out.println("no worries! have a great day anyway!");
			}
			

			if(mood .equals ("tired") ){
			System.out.printf("you're %s,Rest well and recharge! %n", mood);
				if( suggest .equals ("yes")) 
				System.out.println("here is a suggestion for the day: and have a short nap or rest to recharge!");
					if(!suggest .equals("yes"))
				System.out.println("no worries! have a great day anyway!");
			}
			
}



			


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
			System.out.println(" ");
//guess condition


			



			if( guess == 5){
			System.out.println("Wow! you guessed it!");
			}
			else{ System.out.println("aww,your are wrong,Try again next time!");
			}
}
}
