public class TaskSix{
		public static void main(String [] args){

			int count = 1;
			int counter = 1;
			int multiples = 1;
				while(count <= 10){
					if(count % 4 == 0)
					
						while(counter <= 5){
						multiples *= count;
						System.out.print(multiples+" ");
						counter++;
					}
					multiples = 1;
					count++;
					counter = 1;
					
					

				}












	}
}