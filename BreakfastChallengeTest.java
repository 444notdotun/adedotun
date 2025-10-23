import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class  BreakfastChallengeTest{

@Test
public void testThatfunctionexist(){

BreakfastChallenge breakfastchallenge = new BreakfastChallenge();
String output = breakfastchallenge.collectsOnlyString("string");
}

@Test
public void testThatFunctionChangesStringToUpperCase(){

	BreakfastChallenge breakfastchallenge = new BreakfastChallenge();

	String output = breakfastchallenge.collectsOnlyString("the lord is good");

	assertEquals(output,"THE LORD IS GOOD");
}
@Test
public void testThatfunctionGetsTheInput(){
	
	BreakfastChallenge breakfastchallenge = new BreakfastChallenge();
	String output = breakfastchallenge.getsinput("the lord is good");
	assertEquals(output,"the lord is good");
}



































}