package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCreditCalculator {
    CreditCalculator creditCalculator = new CreditCalculator();
    double sumCredit = 100;
    double interest = 10;
    int months = 12;

    @Test
    public void testPayment() {
        double payment = creditCalculator.payment(sumCredit, months, interest);
        double monthInterest = interest * 0.01 / 12;
        assertTrue("Fail test Payment", sumCredit * (monthInterest + (monthInterest / (Math.pow((1 + monthInterest), months) - 1))) == payment);
    }

    @Test
    public void testTotalPayment() {
        double totalPayment = creditCalculator.totalPayment(sumCredit, months, interest);
        double monthInterest = interest * 0.01 / 12;
        assertTrue("Fail test totalPayment", 12 * sumCredit * (monthInterest + (monthInterest / (Math.pow((1 + monthInterest), months) - 1))) == totalPayment);
    }

    @Test
    public void testOverPayment() {
        double overPayment = creditCalculator.overPayment(sumCredit, months, interest);
        double monthInterest = interest * 0.01 / 12;
        assertTrue("Fail test OverPayment",
                12 * sumCredit * (monthInterest + (monthInterest / (Math.pow((1 + monthInterest), months) - 1)))
                        - sumCredit == overPayment);
    }

}
