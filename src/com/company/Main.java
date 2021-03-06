package com.company;

public class Main {
    public static void main(String[] args) {
        BankAccount user = new BankAccount();
        user.deposit(20000);
        System.out.println(" На вашем счету: " + user.getAmount() + "som ");


        while (true) {
            try {
                System.out.println(user.withdraw(6000));

            } catch (LimitException e) {
                try {
                    user.withdraw((int) user.getAmount());
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }
                System.out.println(user.getAmount() - user.getAmount());
                System.out.println("На вашем счете: " + user.getAmount() + "сом. Был снят остаток " +
                        e.getRemainingAmount() + ". " + "Оставшаяся сумма = " +
                        user.getAmount());
                break;
            }

        }
















	/* a)  Написать класс проверяемого исключения LimitException, с конструктором LimitException(String message,
	double remainingAmount) и методом getRemainingAmount().

b)  Написать класс BankAccount с 1 полем double amount - остаток на счете и методами getAmount() - возвращает
        текущий остаток на счете, deposit(double sum) - положить деньги на счет,
                withDraw(int sum) - снимает указанную сумму со счета.

c)  Также метод withDraw() может сгенерировать исключение в том случае если запрашиваемая сумма на снятие
        больше чем остаток денег на счете.

d)  Написать Main класс где бы создавался счет клиента. Положить 20 000 сом на счет.

e)  Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом, при этом отлавливать
        исключение LimitException и при возникновении такого исключения снимать только ту сумму,
                которая осталась на счете и завершать бесконечный цикл */


    }
}
