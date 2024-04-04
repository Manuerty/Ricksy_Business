package edu.party.payment;

public interface PaymentMethod {
    public abstract boolean pay(double amount);
    public abstract double credit();

    public abstract String number();

    public abstract String cardOwner();

}
