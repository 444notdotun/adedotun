import java.util.Scanner;
	public class Game{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			
			int number = 0;
			int game = (int)(Math.random()*3) ;
			
			int computer = 0;
			int human = 0;
			int played = 0;
			int draw = 0;
			int winner = 0;
			int condition = number;
			int keyword = 3;
			

			while(condition != keyword ){
				System.out.print("enter (0) for scissor,(1)rock,(2)paper: ");
				number = input.nextInt();
				keyword = 2;

				

				if(game == number){
					played++;
					if(game == 0 && number == 0 ){
						System.out.println("The computer is scissor, you are scissor too. It is a draw");
						draw++;}
					if(game == 1 && number == 1 ){
						System.out.println("The computer is rock, you are rock too. It is a draw");
						draw++;}
					if(game == 2 && number == 2 ){
						System.out.println("The computer is paper, you are paper too. It is a draw");
						draw++;}

				}


			
				if(game != number){
					played++;
				
					if(game == 0 && number == 1){
						System.out.println(" The computer is Scissor you are rock,  you won!");
						human++;}

					if(game == 0 && number == 2){
						System.out.println(" The computer is Scissor you are paper,  you lose!");
						computer++;}

					if(game == 1 && number == 0){
						System.out.println(" The computer is rock you are scissor,  you lose!");
						computer++;}

					if(game == 1 && number == 2){
						System.out.println(" The computer is rock you are paper,  you won!");
						human++;}

					if(game == 2 && number == 0){
						System.out.println(" The computer is paper you are scissor,  you won!");
						human++;}
					if(game == 2 && number == 1){
						System.out.println(" The computer is paper you are rock,  you lose!");
						computer++;}
				}
				
				
				winner = human - computer;
				
				


				System.out.printf("you have played %d, times and you've won %d times and computer won %d, and drew %d times%n",played,human,computer,draw);
			
				

				

				game = (int)(Math.random()*3) ;
				
				if (winner < 0){
					winner = winner * -1;
					condition = winner;
				}
				else{
				condition = winner;
				}

				System.out.println(condition);

			}
			if(human > computer){
				System.out.print("congratulations you won!");
			}
			else{
				System.out.print(" The computer won, do better next time");
			}
		}

	}