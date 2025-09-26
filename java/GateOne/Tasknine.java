public class TaskNine{
		public static void main(String [] args){

			int count = 1;
			int counter = 1;
			int multiples = 1;
			int sum = 0;
	
			int total = 0;
			int grandtotal = 0;
				while(count <= 10){
					if(count % 4 == 0)
					
						while(counter <= 5){
						multiples *= count;
						sum+= multiples;
						
						
						
						counter++;
					}
					total +=sum;
					grandtotal = total * total;
					sum = 0;
					multiples = 1;
					
					count++;
					counter = 1;
					
					

				}

			System.out.println(grandtotal);










	}
}