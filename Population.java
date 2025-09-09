
public class Population {
	public static void main(String[] args){
		long wp = 8142000000L;
		double gr = 1.0;
		int years1 = 1;
		int years2 = 2;
		int years3 = 3;
		int years4 = 4;
		int years5 = 5;
		double population1 = wp * Math.exp(gr* years1);
		double population2 = wp * Math.exp(gr* years2);
		double population3 = wp * Math.exp(gr* years3);
		double population4 = wp * Math.exp(gr* years4);
		double population5 = wp * Math.exp(gr* years5);

		System.out.printf(" estimated population for year 1 %s%n", population1);
		System.out.printf(" estimated population for year 2 %s%n", population2);
		System.out.printf(" estimated population for year 3 %s%n", population3);			System.out.printf(" estimated population for year 4 %s%n", population4);			System.out.printf(" estimated population for year 5 %s%n", population5);



}
}