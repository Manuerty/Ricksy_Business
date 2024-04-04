package edu.party.payment;

public class CreditCard implements PaymentMethod {
    final String owner;
    final String number;
    private double credit;

    final String SYMBOL = "EZI";

    public CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    @Override
    public boolean pay (double amount){
        if (amount > credit){
            return false;
        }
        credit -= amount;
        return true;
    }
    @Override
    public String number(){
        return this.number;
    }

    @Override
    public String cardOwner(){
        return this.owner;
    }
    @Override
    public double credit(){
        return this.credit;
    }

    public String toString(){
        return "Owner: " + owner + "\nNumber: " + number + "\nCredit: " + credit + SYMBOL;
    }
}
