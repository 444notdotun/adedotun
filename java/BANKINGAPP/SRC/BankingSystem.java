import java.util.ArrayList;

public class BankingSystem {
    private int accountNumber;
    Account account;

    private ArrayList<Account> accountList = new ArrayList();



    public int getAccounts(){
        return accountNumber;
    }


    public void createAccount(String name,String password) {
        account = new Account("ade","1234",accountNumber++);
        accountList.add(account);
    }


}
