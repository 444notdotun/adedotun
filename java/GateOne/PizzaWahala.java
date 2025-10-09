import java.util.Scanner;
	public class PizzaWahala{
		public static void main(String ... args){
		Scanner input = new Scanner(System.in);
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

		System.out.println(menu);

		int price = 0;
		double pizza = 0;
		
		String pizzainput = "hi";
		while(!pizzainput.equals("me")){

		System.out.print("Enter pizza type: ");
		pizzainput = input.nextLine();
		String newPizza = Kata.pizzaOf(pizzainput);
		
		switch(newPizza){
		
			case "1" ->{
				pizza = 4;
				price = 2500;
				
				
			}
			case "2" ->{
				pizza = 6;
				price = 2900;
				
			}
			case "3" ->{
				pizza = 8;
				price = 4000;
				
			}
			case "4" ->{
				pizza = 12;
				price = 5200;
				
			}
			default->{
				System.out.println("check the menu and enter a pizza type");
				pizzainput ="hi";
			}

				
}
break;
}
	


		System.out.print("Enter number of guest: ");
		double guest = input.nextInt();


		int boxes = 0;
		
		
		boxes = (int)(guest/pizza);
		int total =(int)( boxes*pizza);
		int slice =(int)((boxes * pizza)- guest);
		int totalprice = (int)(price * boxes);

		if (guest % pizza > 0){
			
			boxes =(int)(Math.ceil(guest/pizza));
			
			total =(int)(boxes*pizza);
			System.out.println( pizzainput + " " + "contains" + " " + pizza + " slices per box," + " " +  boxes + " " + " boxes should be sufficient for " + " " + guest + " " + " persons as it would contain" + " " + total + " slices in all");

			slice =(int)((boxes * pizza)- guest);
			if(slice == 1){
						System.out.println("Number left over slices after serving "+ slice + " slice");}
			else{	
			System.out.println("Number left over slices after serving "+ slice + " slices");
			}
			totalprice = price * boxes;
			System.out.println("price = " +totalprice);
			
		
		}
		else{
			
		System.out.println( pizzainput + " " + "size contains" + " " + pizza + " slices per box," + " " +  boxes + " " + " boxes should be sufficient for " + " " + guest + " " + " persons as it would contain" + " " + total + " slices in all");
		if(slice == 1){
						System.out.println("Number left over slices after serving "+ slice + " slice");}
			else{	
			System.out.println("Number left over slices after serving "+ slice + " slices");
			}
		System.out.println("price ="+ " " +totalprice);
		}
 
	
		}

	}