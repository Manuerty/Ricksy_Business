package edu.party.logic;

import java.util.HashMap;
import java.util.Map;

public class UFOsPark {
    private double fee;
    final Map<String, String> flota = new HashMap<>();

    UFOsPark(){
        ;
    }

    void add (String UFO){
        flota.put(UFO, "Libre");
    }

    public void dispatch(CreditCard creditCard){
        for (Map.Entry<String, String> ufo : this.flota.entrySet()) {
            if (creditCard.credit() >= fee && ufo.getValue().equals("Libre")){
                creditCard.pay(fee);
                flota.replace( ufo.getKey(), "Libre", creditCard.cardOwner());
                break;
            }
        }
    }
}


