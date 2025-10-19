import java.util.Scanner;
public class Pizza{

public static void pizzaMenu(){
String menu = """
				PIZZA MENU


==============================================================================================
		PIZZA TYPE	NUMBER OF SLICE		PRICE PER BOX
==============================================================================================
		sapa size	4			#2,500
-----------------------------------------------------------------------------------------------
		Small Money	6			#2,900
-----------------------------------------------------------------------------------------------
		Big Boys	8			#4,000
-----------------------------------------------------------------------------------------------
		Odogwu		12			#5,200
===============================================================================================
		""";

System.out.print(menu);
}





public static String pizzaOf(){


Scanner input = new Scanner(System.in);
int count = 1;


while (count >=1){


System.out.print("Enter pizza type: ");
String pizzainput = input.nextLine();

	

		if(pizzainput.equalsIgnoreCase("sapa size")){
			
			count = 0;
			return "1";

		}

		else if(pizzainput.equalsIgnoreCase("small money")){
			
			count = 0;
			return "2";

				
		}
		else if(pizzainput.equalsIgnoreCase("big boys")){
			
			count = 0;
			return "3";
		}
		else if(pizzainput.equalsIgnoreCase("odogwu")){
			
			
			count = 0;
			return "4";
				
		}
		
		else{
			System.out.print("invalid input: ");
		}
			
		}

		
}

public static int pizzaSlice(pizzaof()){
int pizza = 0;
	if (pizzaof().equals("1")){
		pizza = 4;
	}

	else if (pizzaof().equals("2")){
 	pizza = 6;
	}
	else if (pizzaof().equals("3")){
 	pizza = 8;
	}
	else if (pizzaof().equals("4")){
	pizza = 12;
	}
	return pizza;
}

public static int pizzaPrice(pizzaof){
int price = 0;
	if (pizzaof().equals("1")){
		price = 2500;
	}
	else if (pizzaof().equals("2")){
 	price = 2900;
	}
	else if (pizzaof().equals("3")){
 	price = 4000;
	}
	else if (pizzaof().equals("4")){
	price = 5200;
	}
	return price;
}

public static double guestInput(){
Scanner input = new Scanner(System.in);

System.out.print("Enter number of guest: ");
	return	double guest = input.nextInt();
}


public static int boxes(){
	int boxes = (int)(guestInput()/pizzaSlice());
return boxes;
}

public static int total(){
	int total =(int)(boxes()*pizzaSlice());
return total;
}

public static int slice(){
	int slice = (int)(total()-guestInput());
return slice;
}

public static int totalprice(){
	int totalprice = pizzaPrice()*boxes();
return totalprice;
}



public static int 	
			




































}






}
