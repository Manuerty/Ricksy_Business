package edu.party.logic;

import edu.party.payment.CreditCard;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UfosPark {
    private double fee;
    final Map<String, String> flota = new HashMap<>();

    public UfosPark(){
        ;
    }

    public void add (String UFO){
        flota.put(UFO, "Libre");
    }

    public void dispatch(CreditCard creditCard){
        for (Map.Entry<String, String> ufo : this.flota.entrySet()) {
            if (creditCard.credit() >= fee && ufo.getValue().equals("Libre")){
                creditCard.pay(fee);
                flota.replace( ufo.getKey(), "Libre", creditCard.number());
                break;
            }
        }
    }
    public String getUfoOf(String cardNumber) {
        String ufoID = "";
        if(this.flota.containsValue(cardNumber)){
            for (Map.Entry<String, String> ufo : this.flota.entrySet()) {
                if (ufo.getValue().equals(cardNumber)) {
                    ufoID = ufo.getKey();
                }
            }
        }
        return ufoID;
    }
    public boolean containsCard (String cardNumber){
        return this.flota.containsValue(cardNumber);
    }


}


