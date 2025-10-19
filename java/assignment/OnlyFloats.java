public class OnlyFloats{
	public static void main(String [] args){
System.out.print(OnlyFloat(22.1 ,33));
}

		public  double OnlyFloat(Double number1, Double number2){
		double output = 0;
	if( number1 % 1 > 0 && number2 % 1 > 0){
		output = 2;
		 }
	else if( number1 % 1 > 0 || number2 % 1 > 0){
		 output = 1;
			}
		
	else{
		output = 0;
		}

		return output;
}
	
}


