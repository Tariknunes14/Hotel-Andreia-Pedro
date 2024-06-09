public class Bank {

    private int balance = 0;

    public void deposit(int depositAmount) {
        balance += depositAmount;
    };

    public Bank(int balance) {
        this.balance = balance;
    }

    public void spend(int price) {
        if (hasMoney(price)) {
            balance -= price;
        }
    };

    public boolean hasMoney(int price) {
        if (balance > price) {
            return true;
        }
        else {
            return false;
        }
    };

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                '}';
    }

}

