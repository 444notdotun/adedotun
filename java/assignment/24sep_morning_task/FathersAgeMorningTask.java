/*ask user for two input and save one as father's age and the other as sons age ranging from 1-80
check if the user input are greater than 1 and lesser than 80
initialize tempson'sage to be  2 multiply by sons age 
initialize total to 0
check if tempson'age is greater than or equals to the fathers age, if yes, subtract father'sage from tempson'sage  and save in total, display the father age was twice as old as his son in total years, if not
check if tempson'sage is lesser than the fathers age, if yes, subtract tempson'sage from father'sage and save in total, display the father age was will be twice as the sons age in total years.*/



import java.util.Scanner;
	public class FathersAgeMorningTask{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter fathers age(less than 80): ");
			int fatherage = input.nextInt();
			System.out.print("enter son's age(greater than 1): ");
			int sonage = input.nextInt();
			
			int tempsonsage = 2 * sonage;
			
			if(fatherage <= 80 && sonage > 1){
				if(tempsonsage >= fatherage){
					int total = Math.abs(fatherage - tempsonsage);
					System.out.print("The fathers age was twice as old as his sons in" + total + "years"); 
			}
				else if(tempsonsage < fatherage){
					int total = Math.abs( tempsonsage - fatherage);
					System.out.print("The fathers age will be twice as old as his sons in" + total + "years"); 
			}
			
			}
			else{
				System.out.print("invalid input");
			}

	}


}
