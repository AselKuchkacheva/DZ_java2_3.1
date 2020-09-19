package com.company;

public class LimitException extends Exception{
    //private String message;
    private double remainingAmount; //оставщиеся количество

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }


    public double getRemainingAmount() { //получить оставшуюся сумму
        return remainingAmount;
    }
}
