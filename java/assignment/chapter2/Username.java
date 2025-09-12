import java.util.Scanner;
public class Username{
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			System.out.print("enter username:");
			String name = scanner.nextLine();
			System.out.printf("my name is %s%n",name);
}
}