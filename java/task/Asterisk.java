public class Asterisk{
	public static void main(String ... args){
	int count = 10;
	int counting = 1;
	int counter = 1;
	while(count >= 0){
	if (count <= 9){
		while (counting <= counter){
			System.out.print(" ");
			counting++;
			}
		counting=1;
		counter++;
		}

		while(counting <= count){
			System.out.print("*");
			counting++;
		}
	counting=1;
	System.out.println("");
	
	count--;
}















}	

}