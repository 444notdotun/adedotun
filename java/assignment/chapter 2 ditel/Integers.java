public class Integers{
	public static void main(String[] args){
		int figure1 = 10;
		int figure2 = 4;
		int figure3 = 1;
		int figure4 = 5;
		int figure5 = 7;
		int smallest =  figure3;
//smallest
		
		if(figure1 < smallest){
			System.out.println(figure1);
		}
		if(figure2 < smallest){
			System.out.println(figure2);
		}
		if(figure4 < smallest){
			System.out.println(figure4);
		}
		if(figure5 < smallest){
			System.out.println(figure5);
		}
		if(figure3 == smallest){
			System.out.printf(" The smallest integer is			%d%n",smallest);
		}
//largest;
		int largest = figure1;
		if(figure2 > largest){
			System.out.println(figure2);
		}
		if(figure3 > largest){
			System.out.println(figure3);
		}
		if(figure4 > largest){
			System.out.println(figure4);
		}
		if(figure5 > largest){
			System.out.println(figure5);
		}		
		if(figure1 == largest){
			System.out.printf(" The largest integer is %d%n			",largest);
		}

		
}
}

