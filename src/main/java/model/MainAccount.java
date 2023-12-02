package model;

public class MainAccount extends Account {

    public MainAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) throws InsufficientFundsException {
        if (amount > 0)
            balance -= amount;
        else {
            throw new InsufficientFundsException("Депозит не может быть отрицательным");
        }
    }


    @Override
    public void setBalance() {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        }
        if (amount < 0) {
            throw new InsufficientFundsException("Нельзя снять отрицательное число");
        } else {
            throw new InsufficientFundsException("Недостаточно средств на счете");
        }
    }
}

