public class TabularOutput{
	public static void main(String[] args){
		int num1 = 1;
		int count = 1;
		int counter = 1;
		int net = 1;
		 System.out.printf("N \t N^2 \t N^3 \t N^4 %n");
		
		while(count <= 5){
			
			while(net <= 4){
				//System.out.println(num1);
				num1*=counter;

				System.out.print(num1 + "\t");
				net++;
							
				
				//System.out.print(num1+ "\t");

				 
			}
			System.out.println();
			num1 =1;
			
			net = 1;
			counter++;
			
			count++;
						
				

		
		}
		
						
		
			










		}
	}