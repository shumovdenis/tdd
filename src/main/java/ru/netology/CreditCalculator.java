package ru.netology;

public class CreditCalculator {

    public static void main(String[] args) {
    }

    public double payment(double sumCredit, int months, double interest) {
        double monthInterest = interest * 0.01 / 12;
        double payment = sumCredit * (monthInterest + (monthInterest / (Math.pow((1 + monthInterest), months) - 1)));
        return payment;
    }

    public double totalPayment (double sumCredit, int month, double interest) {
        double monthInterest = interest * 0.01 / 12;
        double totalPayment = 12 * sumCredit * (monthInterest + (monthInterest / (Math.pow((1 + monthInterest), month) - 1)));
        return totalPayment;
    }

    public double overPayment(double sumCredit, int month, double interest) {
        double monthInterest = interest * 0.01 / 12;
        double overPayment = 12 * sumCredit * (monthInterest + (monthInterest / (Math.pow((1 + monthInterest), month) - 1))) - sumCredit;
        return overPayment;
    }
}