public class Account {
    private int balance;

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
