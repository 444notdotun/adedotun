public class BreakfastChallenge{

public String collectsOnlyString(String input){
	int count = 0;
	String output ="";
	while( count < input.length()){
		if(Character.isDigit(input.charAt(count))){
			count++;}
		else{
			output = "invalid input";
		}
	return output;
}
}

}