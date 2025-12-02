import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {
    Account myaccount;
    @Before
    public void setup() {
        myaccount = new Account();
    }

    @Test
    public void myAccount_balanaceIsEmptyTest(){
    assertEquals(0,myaccount.getbalance());
    }

    @Test
    public void myAccount_caDeposit5hAndBalance5hTest(){
        myaccount.deposit(500);
        assertEquals(500,myaccount.getbalance());
    }

    @Test
    public void myAccount_canNotDepositNegativeIntoBalance0hTest(){
        assertThrows(validateAmount.class,() -> myaccount.deposit(-500));
        assertEquals(0,myaccount.getbalance());
    }

    @Test
    public void myAccount_canWithdraw2hAndBalance2hTest(){
        myaccount.deposit(400);
        assertEquals(400,myaccount.getbalance());
        myaccount.withdraw(200);
        assertEquals(200,myaccount.getbalance());
    }

    @Test
    public void myAccount_CanNotWithdrawNegativeAmountAndBalance5hTest(){
        myaccount.deposit(500);
        assertEquals(500,myaccount.getbalance());
        assertThrows(validateAmount.class,() -> myaccount.withdraw(-200));
    }

    @Test
    public void myAccount_canWithdraw5hAndBalance2hTest(){
        myaccount.deposit(200);
        assertEquals(200,myaccount.getbalance());
        assertThrows(validateAmount.class,() -> myaccount.withdraw(500));
    }


}
