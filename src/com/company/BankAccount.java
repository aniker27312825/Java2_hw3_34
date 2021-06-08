package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
    }

    public double withdraw(int sum) throws LimitException {

        if (sum > amount) {
            System.out.println("Сумма больше остатка на счете. Введите другую сумму " + amount);
            throw new LimitException("У вас недостаточно средств на балансе " + amount, amount);
        } else {
            amount = amount - sum;
        }
        return amount;
    }
}
