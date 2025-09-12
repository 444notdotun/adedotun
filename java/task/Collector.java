import java.util.Scanner;
	public class Collector{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
//input first student name 
			System.out.print("Enter first name:");
			String firstname = input.nextLine();
//input second student name 
			System.out.print("Enter second name:");
			String secondname = input.nextLine();
			
//input third student name
			System.out.print("Enter third name:");
			String thirdname = input.nextLine();
			
//input first student score
			System.out.print("Enter first student score:");
			int firstscore = input.nextInt();
//input second student core
			System.out.print("Enter secondstudentscore:");
			int secondscore = input.nextInt();
//input third student score
			System.out.print("Enter third student score:");
			int thirdscore = input.nextInt();

//highest score
			int highest = firstscore;
			String hname = firstname;
			 

			if(secondscore > highest){
			highest = secondscore;
			hname = secondname;
}

			if(thirdscore > highest){
			highest = thirdscore;
			hname = thirdname;
}
			
			if(firstscore == highest){
			hname = firstname;
			highest = firstscore;
}
			System.out.printf( "The student with the highest score name is %s and the score is %d%n",hname,highest);


//lowest score
			int lowest = secondscore;
			String lname = secondname;

			if(secondscore == lowest){
			lname = secondname;
} 

			if(thirdscore < lowest){
			lowest = thirdscore;
			lname = thirdname;
} 

			if(firstscore < lowest){
			lowest = firstscore;
			lname = firstname;
			}

			System.out.printf( "The student with the lowest score name is %s and the score is %d%n", lname,lowest);





}
}