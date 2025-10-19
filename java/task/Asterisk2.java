public class Asterisk2{
	public static void main(String ... args){
	int count = 1;
	int counting = 1;
	int counter = 9;
	while(count <= 10){
	if (count <= 9){
		while (counting <= counter){
			System.out.print(" ");
			counting++;
			}
		counting=1;
		counter--;
		}

		while(counting <= count){
			System.out.print("*");
			counting++;
		}
	counting=1;
	System.out.println("");
	
	count++;
}















}	

}