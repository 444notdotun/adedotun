public class Kata{

public static int FactorOf(int number){
int count = 1;
int factor = 0;
while(count <= number){
	if(number % count == 0){
		factor+=1;
	}
count++;
}
return factor;

}



public static boolean IsPrime(int primeNumber){

if (primeNumber == 1){
	
	return false;
}
			
double number = Math.sqrt(primeNumber);
number+=1;

int count = 2;
int division = 0;
	while (count <= number){
		division = primeNumber %  count;
		if (division == 0 && count < number){
			
			return false;
			
		}
	count++;
	}
		




return true;


}



public  static boolean isOdd(int number){

if(number % 2 >0){

return true;
}


return false;



}




public static boolean isLeapYear(int year){
if(year % 4 == 0){
	if(year % 100 == 0){
		if (year % 400 == 0){
			return true;}
	return false;
	}
return true;
}
return false;
}

public static double celsiusOf(double number){
double A = 5;
double B = 32;
double C = 9;
double subtract = number - B;
double celsius = (A*subtract)/C;
return celsius;

}



public static void printStars(int Rows){
int count = 1;
int counting = 1;
while (count <= Rows){
	while (counting <= count){
		System.out.print("*");
		System.out.print(" ");
		counting++;}
	count++;
	counting = 1;
	System.out.println();




	}
}




public static boolean isEven(int number){
	if(number % 2 == 0){
		return true;
	}
	
return false;
}

public static int subtract(int number1, int number2){
	int subtract = number1 - number2 ;
	if (number2 > number1){
	 subtract = subtract * -1;
		return subtract;
	}
	return subtract;


}
public static float divide(int number1, int number2){
	if (number2 == 0){
	return 0;}
	float quotient = number1 / number2;
	return quotient;


}

public static boolean isSquare( int number ){
double modulus = (Math.sqrt(number)) % 1;
if (modulus == 0)
	return true;
	

return false;

}

public static boolean isPalindrome(int number){
int lastnumbers = 0;
int firstnumbers = 0;
int lastnum1 =  0;
int lastnum2 = 0;
int firstnum1 = 0;
int firstnum2 = 0;


	if (number >=10000 && number <= 99999){
	lastnumbers = number % 100;
	firstnumbers = number / 1000;
	lastnum1 = lastnumbers % 10;
	lastnum2 = lastnumbers / 10;
	firstnum1 = firstnumbers % 10;
	firstnum2 = firstnumbers / 10;
				
		if( lastnum1 == firstnum2 && lastnum2 == firstnum1)
			return true;	
		else
			return false;
	}
	return false;		
	
}	


public static long factorialOf(int number){

			
			
			int sum = 1;

			while(number > 0){
				sum *= number;
				number--;
			}

			return sum;	

}
public static long squareOf(int number){
	int square = number *number;
	return square;
}


}







