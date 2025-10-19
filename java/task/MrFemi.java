public class MrFemi{
	public static void main(String ... args){

	int [] num1 = {10,9,13,2,14 ,67, 83, 7, 43, 76, 32, 31, 57, 46};
	int largest = num1[0];
	int count = 1;
	while(count < num1.length){

		if (num1[count] > largest){
			largest = num1[count];
		}
		count++;
	}
	System.out.println(largest);





	int [] num2 = {36,14,57,23,43,0,-1};
	int largest1 = num2[0];
	count = 1;
	while(count < 7){
		if (num2[count] > largest1){
		largest1 = num2[count];
	}
	count++;
	}
	System.out.print(largest1);
}
}
			