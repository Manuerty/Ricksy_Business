package edu.party.logic;

public class CreditCard {
    final String owner;
    final String number;
    private double credit;

    final String SYMBOL = "EZI";

    CreditCard(String owner, String number) {
        this.owner = owner;
        this.number = number;
    }

    boolean pay (double amount){
        if (amount > credit){
            return false;
        }
        credit -= amount;
        return true;
    }

    String number(){
        return this.number;
    }

    String cardOwner(){
        return this.owner;
    }

    double credit(){
        return this.credit;
    }

    public String toString(){
        return "Owner: " + owner + "\nNumber: " + number + "\nCredit: " + credit + SYMBOL;
    }
}
