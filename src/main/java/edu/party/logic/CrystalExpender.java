package edu.party.logic;

public class CrystalExpender implements GuestDispatcher{
    private int stock = 0;
    private double ItemCost = 0.0;
    CrystalExpender (int stock, double ItemCost){
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

    int stock (){
        return this.stock;
    }

    @Override
    public String toString(){
        return "Stock: " + stock + "\nItem Cost: " + ItemCost;
    }
}
