public class Testing{
	public static void main(String ... args){
int count = 1;
int counting = 1;

while (count <= 6){
	while (counting <= count){
		System.out.print("*");
		System.out.print(" ");
		counting+=1;}
	counting = 1;
	count+=1;

	System.out.println();}

System.out.println("==========================================================");
if (count == 7){
count--;
while (count <= 6){
	while (counting <= count){
		System.out.print("*");
		System.out.print(" ");
		counting+=1;}
	counting = 1;
	count-=1;

	System.out.println();
	if (count == 0){
		break;}
}

/*System.out.println("==========================================================");

if (count == 0){
count= 6;
int counter = 6;
counting = 2;
while (count <= 6){
	while (counting <= count){
		System.out.print(" ");
		counting+=1;}
	while(counter <=count){
	System.out.print("* ");}
	counter--;
	
	count= 6;
if (counter == 6){
	break;}

	System.out.println();

}
}*/
}
}
}