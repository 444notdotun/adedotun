
public class Giza{
	public static void main(String[] args){
	int stonesused = 2300000;
	double stoneweight = 2.5-1.5;
	int yearstaken = 7309;
	int mass = 5750000;
	int averagedays = 365;
	int constyear = 20;
	int a = mass/constyear;
	int b = mass/(constyear * 365 * 24);
	int c = mass/(constyear * 365 * 24 * 60);
	System.out.printf("weight of pyramid built in each year %d tonnes %n weight of pyramid built in each hour %d tonnes %n weight of  pyramid built in each minutes %d tonnes",a,b,c);

}
}