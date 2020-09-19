package com.company;

public class BankAccount {

    private double amount;//остаток на счете


    public double getAmount() { //возвращает текущий остаток на счете
        return amount;
    }

    public double deposit(double sum) { //положить деньги на счет
        amount = amount + sum;
        return amount;
    }

    public void withDraw(int sum) { //снимает указанную сумму со счета

        while (true) {
            if (amount < sum) {
                try {
                    throw new LimitException("Запрашиваемая сумма, больше остатка = " + amount, amount);

                } catch (LimitException lE) {
                    System.out.println(lE.getMessage());

                } finally {
                    withDraw((int) amount);
                }
            }
            if (amount >= sum) {
                amount = (int) (amount - sum);
                System.out.println(amount);
            }
            if (amount == 0.0) {
                break;
            }


        }

    }


}
