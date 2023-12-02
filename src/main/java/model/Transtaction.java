package model;

public class Transtaction {
    public static void transfer(Account sourceAccount, Account targetAccount, double amount) throws InsufficientFundsException{
        if (amount <= sourceAccount.getBalance()) {
            sourceAccount.withdraw(amount);
            targetAccount.deposit(amount);
        } else {
            throw new InsufficientFundsException("Недостаточно средств для перевода");
        }
    }
}