package model;

public class DebitAccount extends Account {
    public DebitAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) throws InsufficientFundsException {
        if (amount > 0)
            balance += amount;
        else {
            throw new InsufficientFundsException("Депозит не может быть отрицательным");
        }
    }
}