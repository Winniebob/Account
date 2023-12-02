package model;

import java.util.Scanner;

public class AccountDemo {

    private static void deposit(Account account, Scanner scanner) {
        System.out.print("Введите сумму депозита: ");
        double amount = scanner.nextDouble();
        try {
            System.out.println(amount);
            account.deposit(amount);
            System.out.println("Депозит успешно выполнен.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void withdraw(Account account, Scanner scanner) {
        System.out.print("Введите сумму для снятия: ");
        double amount = scanner.nextDouble();
        try {
            account.withdraw(amount);
            System.out.println("Снятие успешно выполнено.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkBalance(Account account) {
        System.out.println("Текущий баланс: " + account.getBalance());
    }

    private static void makeTransaction(Account sourceAccount, Account targetAccount, Scanner scanner) {
        System.out.print("Введите сумму для перевода: ");
        double amount = scanner.nextDouble();
        try {
            Transtaction.transfer(sourceAccount, targetAccount, amount);
            System.out.println("Транзакция успешно выполнена.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double initialBalance = 0;
        MainAccount account = null;
        try {
            System.out.print("Введите начальный баланс счета: ");
            initialBalance = scanner.nextDouble();
            account = new MainAccount(initialBalance);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.exit(1);
        }
        CreditAccount creditAccount = new CreditAccount(initialBalance);
        DebitAccount debitAccount = new DebitAccount(initialBalance);

        int choice = 0;
        while (choice != 5) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Внесение депозита");
            System.out.println("2. Снятие средств");
            System.out.println("3. Просмотр текущего баланса");
            System.out.println("4. Перевод между счетами");
            System.out.println("5. Выход");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit(account, scanner);
                    break;
                case 2:
                    withdraw(account, scanner);
                    break;
                case 3:
                    checkBalance(account);
                    break;
                case 4:
                    System.out.println("\nВыберите счет отправителя:");
                    System.out.println("1. Основной счет");
                    System.out.println("2. Кредитный счет");
                    System.out.println("3. Дебетовый счет");
                    System.out.print("Ваш выбор: ");
                    int sourceChoice = scanner.nextInt();

                    System.out.println("\nВыберите счет получателя:");
                    System.out.println("1. Основной счет");
                    System.out.println("2. Кредитный счет");
                    System.out.println("3. Дебетовый счет");
                    System.out.print("Ваш выбор: ");
                    int targetChoice = scanner.nextInt();


                    Account sourceAccount, targetAccount;
                    if (sourceChoice == 1) {
                        sourceAccount = account;
                    } else if (sourceChoice == 2) {
                        sourceAccount = creditAccount;
                    } else {
                        sourceAccount = debitAccount;
                    }

                    if (targetChoice == 1) {
                        targetAccount = account;
                    } else if (targetChoice == 2) {
                        targetAccount = creditAccount;
                    } else {
                        targetAccount = debitAccount;
                    }

                    makeTransaction(sourceAccount, targetAccount, scanner);
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }
}