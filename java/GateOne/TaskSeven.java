public class TaskSeven{
		public static void main(String [] args){

			int count = 1;
			int counter = 1;
			int multiples = 1;
			int sum = 0;
				while(count <= 10){
					if(count % 4 == 0)
					
						while(counter <= 5){
						multiples *= count;
						sum+= multiples;
						
						
						
						counter++;
					}
					if(sum> 0)
					System.out.print(sum+" ");

					sum = 0;
					multiples = 1;
					
					count++;
					counter = 1;
					
					

				}

			










	}
}