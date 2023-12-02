package model;

public abstract class Account {
    protected double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance() {
        this.balance = balance;
    }

    public void deposit(double amount) throws InsufficientFundsException {
        if (amount > 0)
            balance -= amount;
        else {
            throw new InsufficientFundsException("Депозит не может быть отрицательным");
        }
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