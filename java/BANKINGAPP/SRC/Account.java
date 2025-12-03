public class Account {
    private int balance;
    private String name;
    private String password;
    private int accountNumber;
    public Account(String name, String password, int accountNumber) {
        this.name = name;
        this.password = password;
        this.accountNumber = accountNumber;
    }

    public Account() {

    }



    public int getbalance() {

       return balance;
    }

    public void deposit(int amount) {
        validate(amount);
        balance+=amount;
    }
    private  void validate(int amount) {
        if (amount < 0) throw new validateAmount("Invalid amount");
    }

    public void withdraw(int amount) {
        validate(amount);
        validateAmountAboveBalance(amount);
        balance-=amount;
    }

    private void validateAmountAboveBalance(int amount) {
        if (amount > balance) throw new validateAmount("Insufficient balance");
    }

}
