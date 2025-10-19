public class LargestFemi{
	public static void main(String ... args){
	int [] num1 = { 10,9,13,2,14};
	int largest = num1[0];
	int count = 0;
	for(count = 1; count < num1.length; count++){
		if ( num1[count] > largest){
			largest = num1[count];
		}
	
}
System.out.print(largest);
}
}