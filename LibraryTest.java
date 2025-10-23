import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LibraryTest{

	@Test
	public void testThatLibraryHasNoBook(){
	//Arrange
	Library library = new Library();
	
	//Acts
	int result = library.totalNumberOfBooks();
	
	//assert
	assertEquals(result, 0);

	}



	@Test
	public void testThatOneBookIsAddedToTheLibraryAndTheTotalNumberOfBooksIsOne(){
	//Arrange
	Library library = new Library();
	
	//Act
	String response = library.addBook("Things Fall Apart");
	
	//Arrange
	assertEquals(response,"Book Added Successfully");
	}
	

	@Test
	public void testThatTotalNumberOfBooksInTheLibraryIsOne(){
	//Arrange
	Library library = new Library();

	//Act
	library.addBook("enilowo lomo");
	int result = library.totalNumberOfBooks();

	//assert
	assertEquals(result,1);
	}


































	

}
	