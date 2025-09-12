import java.util.Scanner;
	public class TaskName{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
//input first name 
			System.out.print("Enter first name:");
			String firstname = input.nextLine();
//input second  name 
			System.out.print("Enter second name:");
			String secondname = input.nextLine();
			
//input third  name
			System.out.print("Enter third name:");
			String thirdname = input.nextLine();
			
//input first  age
			System.out.print("Enter age1:");
			int firstage = input.nextInt();
//input second age
			System.out.print("Enter age2:");
			int secondage = input.nextInt();
//input third age
			System.out.print("Enter age3:");
			int thirdage = input.nextInt();

//oldest
			int oldest = firstage;
			String oldestname = firstname;
			 

			if(secondage > oldest){
			oldest = secondage;
			oldestname = secondname;}

			if(thirdage > oldest){
			oldest = thirdage;
			oldestname = thirdname;}

//youngest
			int youngest = firstage;
			String youngestname = firstname;
			 

			if(secondage < youngest){
			youngest = secondage;
			youngestname = secondname;}

			if(thirdage < youngest){
			youngest = thirdage;
			youngestname = thirdname;}
			
			
			System.out.printf(" The name of the oldest is %s%n The name of the youngest is %s ",oldestname,youngestname);

			











}
}