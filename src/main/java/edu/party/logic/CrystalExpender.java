package edu.party.logic;

import edu.party.payment.CreditCard;

public class CrystalExpender implements GuestDispatcher{
    private int stock = 0;
    private double ItemCost = 0.0;
    public CrystalExpender (int stock, double ItemCost){
        this.stock = stock;
        this.ItemCost = ItemCost;
    }
    @Override
    public void dispatch(CreditCard creditCard){
        if (creditCard.credit() >= ItemCost && stock > 0){
            creditCard.pay(ItemCost);
            stock--;
        }
    }

    public int stock (){
        return this.stock;
    }

    @Override
    public String toString(){
        return "Stock: " + stock + "\nItem Cost: " + ItemCost;
    }
}
