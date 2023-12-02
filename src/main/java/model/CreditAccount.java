package model;

public class CreditAccount extends Account {
    public CreditAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        }
        else if (amount < 0) {
            throw new InsufficientFundsException("Нельзя перевести отрицательное число");
        } else {
            throw new InsufficientFundsException("Недостаточно средств на счете");
        }
    }
}