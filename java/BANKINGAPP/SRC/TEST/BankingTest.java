import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankingTest {
    BankingSystem firstBank;

    @Before
    public void setUp() {
        firstBank =  new BankingSystem();
    }

    @Test
    public void firstBank_HasNoAccount(){
        assertEquals(0,firstBank.getAccounts());
    }

    @Test
    public void firstBank_AccountContainsMoreAccounts(){
        firstBank.createAccount("Ade","12345");
        assertEquals(1,firstBank.getAccounts());
    }

}
