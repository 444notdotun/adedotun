 import java.util.Scanner;
	public class Energy{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("enter mass of water: ");
			double water = input.nextDouble();
			System.out.print("enter finial temperture: ");
			double finial = input.nextDouble();
			System.out.print("enter initial temperture: ");
			double initial = input.nextDouble();
			double q = water * (finial - initial) * 4184;
			System.out.printf("The interest is %.4f",q); 
}
}