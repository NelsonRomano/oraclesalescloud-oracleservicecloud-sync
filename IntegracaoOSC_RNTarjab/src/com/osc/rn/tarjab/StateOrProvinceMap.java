package com.osc.rn.tarjab;

import java.util.HashMap;
import java.util.Map;

public class StateOrProvinceMap {
    private static Map<String, String> stateOrProvinceMap; 
    
    public static Map<String, String> getMap(){
        if(stateOrProvinceMap == null){
            stateOrProvinceMap  = new HashMap<String, String>();
            String[] key = { "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72",
                "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86" };
            
            String[] value = { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará",
                "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso",
                "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí",
                "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond�nia", "Roraima",
                "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" };            
            
            for (int i = 0; i < value.length; i++) {
                stateOrProvinceMap.put(key[i], value[i]);
            }
            
        }
        
        return stateOrProvinceMap;
    }
    
}