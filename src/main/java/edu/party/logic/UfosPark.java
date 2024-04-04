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

}


