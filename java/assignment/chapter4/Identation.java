public class Identation{
	public static void main(String [] args){

int x = 5;
int y = 8;

if (x < 10)
 	if (y > 10)
 		System.out.println("*****"); 
 	else
 		System.out.println("#####");
		System.out.println("$$$$$");




if (x < 10) {
	 if (y > 10)
 		System.out.println("*****"); 
}
 else {
 	System.out.println("#####");
 	System.out.println("$$$$$");
}


y = 8;
x = 5;


if (y == 8)
	if (x == 5)
		System.out.println("@@@@@");
else
	System.out.println("#####");	
	System.out.println("$$$$$");
 	System.out.println("&&&&&");


}
}