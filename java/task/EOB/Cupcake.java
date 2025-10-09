public class Cupcake{


public static int  smallestOf(int [] numbers){
int count = 0;
int  smallest = numbers[count];
count=1;
while(count < numbers.length){

if(numbers[count] < smallest){
	smallest = numbers[count];

}
count++;
}
return smallest;
}

public static double averageOf(int [] numbers){
int count = 0;
int average = 0;
int sum = 0;
while(count < numbers.length){
sum +=numbers[count];
count++;
}
average = sum/numbers.length;

return average;
}

public static int countOccurence(int [] number,int targetnumber){

int count = 0;
int occur = 0;
while(count < number.length){
if(number[count] == targetnumber){
occur++;
}
count++;
}
return occur;
}

public static boolean containsElement(int [] number,int targetnumber){

int count = 0;

while(count < number.length){
if(number[count] == targetnumber){
return true;
}
count++;
}
return false;
}


public static int getFirstElement(int [] number){
if(number.length == 0){
return 0;
}
return number[0];
}

public static int getLastElement(int [] number){
if(number.length == 0){
return 0;
}
return number[number.length-1];
}

/*public static int arrayLength(int [] number){
int count = 0;
while count




}*/

public static int getMiddleELement(int[] numbers){
if(numbers.length % 2 > 0){
 int result = (numbers.length/2);
return numbers[result];
}

int result = (numbers.length/2)-1;
return numbers[result];
}


public static void swapFirstAndLast(int [] numbers){
int array = numbers[0];
numbers[0] = numbers[numbers.length-1];
numbers[numbers.length-1]=array;
int count = 0;
while(count < numbers.length){
System.out.print(numbers[count]+" ");
count++;

}
}












































}