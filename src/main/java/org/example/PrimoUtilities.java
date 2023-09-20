package org.example;

import java.util.ArrayList;
import java.util.logging.Logger;

public class PrimoUtilities {
    //Para crear logs
   static Logger logger = Logger.getLogger(PrimoUtilities.class.getName());
    public static Boolean esPrimo(Integer i){
        if (i == 0 || i == 1 || i == 4) {
            return false;
        }
        for (Integer x = 2; x < i / 2; x++) {
            if (i % x == 0) //hola
                return false;
        }
        logger.info("Primo encontrado: " + i);
        return true;
    }
    public static ArrayList<Integer> primosIntervalo(Integer inicial, Integer finalIntervalo){
        //Igual que en Kotlin "var" infiere el tipo de dato
        var salida = new ArrayList<Integer>();
        for (Integer numero = inicial; numero < finalIntervalo; numero++){
            if (esPrimo(numero)){
                salida.add(numero);
            }
        }
        return salida;
    }
}
