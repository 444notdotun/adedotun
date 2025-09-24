/*use "count" to represent digit 1 where the number to start running from.
 include  the benchmark where the number stops which is less than or greater than 10.
represent "count " divisible by 2 as letter "a".
 if the number  in count on every increment is divisible by 2, print out the number, until it stops when the number is less than or equal to 10*/  






public class OddLoop{
		public static void main(String[] args){
		int count = 1;
		while(count <= 10){
		int a = count % 2;
		if( a >= 1){
		System.out.println(count);}
		count++;
		}



		}
}