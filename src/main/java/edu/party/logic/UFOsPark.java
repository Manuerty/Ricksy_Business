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
        if (creditCard.credit() >= fee && !flota.isEmpty() && flota.containsValue("Libre")){
            creditCard.pay(fee);
            flota.replace( UFO, "Libre", creditCard.cardOwner());
        }
    }

}
