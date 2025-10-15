public class FemiTask{
	public static void main(String... args){
		for(int number = 1;number <= 100;number++){
			if(number % 2 == 0){
			System.out.println("even numbers " + number);
			}
		}
		System.out.println();
		System.out.println();

		
		for(int number = 50;number <= 100;number++){
			if(number % 2 > 0){
			System.out.println("odd numbers "+ number);
			}
		}
		System.out.println();
		System.out.println();

		for(int number = 100;number >= 1;number--){
			
			System.out.println("numbers " + number);
			
		}

		System.out.println();
		System.out.println();
		
		for(int number = 1;number <= 20;number++){
			int total = number*number;
			System.out.println("square " + number + " is " + total);
			
		}

		System.out.println();
		System.out.println();

		for(int number = 1;number <= 50;number++){
			if(number% 3 == 0){
			System.out.println("multiples of 3 are " + number);
			
		}
		}



		System.out.println();
		System.out.println();

		for(int number = 1;number <= 100;number++){
			if(number% 3 == 0 && number % 5 == 0){
			System.out.println("multiples of 3 and 5 are " + number);
			
		}
		}
		System.out.println();
		System.out.println();
		int count = 1;
		for(int number = 1;number <= 100;number++){
			if(number% 7 == 0 ){
			
			count++;
		}
		}
		System.out.println("multiples of 7 in 1 and 100 is " +count);


		System.out.println();
		System.out.println();

		for(int number = 1;number <= 100;number++){
			if(number% 7 == 0 ){
			System.out.println("multiples of 7 are " + number);
			
		}
		}

		System.out.println();
		System.out.println();
		int total=0;
		for(int number = 1;number <= 50;number++){
			total+=number;
			
			
		
		}
		System.out.println("sum of natural numbers is " + total);

		System.out.println();
		System.out.println();
		


		System.out.println();
		System.out.println();


		int total1=1;
		for(int number = 1;number <= 10;number++){
			total1*=number;
			
			
		
		}
		System.out.println("product of natural numbers is " + total1);


		System.out.println();
		System.out.println();
		
		for(char character = 'A';character <= 'Z';character++){
			System.out.println(character );	
		
		}
		

		System.out.println();
		System.out.println();
		total=0;
		for(int number = 1;number <= 12;number++){
			total= 3*number;
			System.out.println("3 * " + number + " = " + total );	
		
		}


		System.out.println();
		System.out.println();
		
		String letter = "string";
		for(int number = 0;number < letter.length();number++){
			char letters = letter.charAt(number);
			System.out.println(letters );	
		
		}

		System.out.println();
		System.out.println();
		count = 0;
		letter = "string";
		for(int number = 0;number < letter.length();number++){
			char letters = letter.charAt(number);
			if (letter.equalsIgnoreCase("e")){
				count++;
			}
				
		
		}
		System.out.println("amount of e " + count);

		System.out.println();
		System.out.println();
		


		String word = "adedotun";
		for(count = 0; count < word.length(); count++){
			char letters =word.charAt(count);
			System.out.println(Character.toUpperCase(letters));
			
		}

		System.out.println();
		System.out.println();
		


		word = "adedotun";
		for(count = 0; count < word.length(); count++){
			char letters =word.charAt(count);
			System.out.println(Character.toLowerCase(letters));
			
		}


		System.out.println();
		System.out.println();
	


		String vowels = "aeiou";
		String words = "mr femi";
		int vowelCount = 0;
		for (count = 0; count < words.length(); count++) {
    			char letterOf = words.toLowerCase().charAt(count);
   			 for (int index = 0; index < vowels.length(); index++) {
        			if (letterOf == vowels.charAt(index)) {
          			  vowelCount += 1;
           				 break;
       				 }
  				  }
				}
		System.out.print("vowels = " + vowelCount);


		System.out.println();
		System.out.println();
		
		String ofNumbers = "12345";
		count = 0;
		while (count < ofNumbers.length()){
			char letterOf = ofNumbers.charAt(count);
			count++;
		}
		System.out.print("count of numbers in a number " + count);
	
		System.out.println();
		System.out.println();
		int sum =0;
		ofNumbers = "12345";
		count = 0;
		while (count < ofNumbers.length()){
			char letterOf =  ofNumbers.charAt(count);
			sum+=Character.getNumericValue(letterOf);
			count++;
		}
		System.out.print("sum of digits in a number " + sum);

	

		System.out.println();
		System.out.println();
		int [] sumOf = new int [5];
		ofNumbers = "12345";
		count = 0;
		sum =0;
		int largest = 0;
		while (count < ofNumbers.length()){
			char letterOf =  ofNumbers.charAt(count);
			sumOf[count] = Character.getNumericValue(letterOf);
			largest = sumOf[0];
			
			if (sumOf[count]> largest){
			largest = sumOf[count];
			
			}
			count++;
		}
		System.out.print("largest of digits in a number " + largest);


		System.out.println();
		System.out.println();
		int [] smallestOf = new int [5];
		ofNumbers = "12345";
		count = 0;
		sum =0;
		int smallest = 0;
		while (count < ofNumbers.length()){
			char letterOf =  ofNumbers.charAt(count);
			smallestOf[count] = Character.getNumericValue(letterOf);
			smallest = smallestOf[0];
			
			if (smallestOf[count] < smallest){
			smallest = smallestOf[count];
			
			}
			count++;
		}
		System.out.print("smallest of digits in a number " + smallest);


	}
}
				