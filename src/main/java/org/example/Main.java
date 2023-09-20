package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean salida = false;

        while(!salida) {
            System.out.println("Escribe el inicio: ");
            Integer init = sc.nextInt();

            if (init == 0) {
                System.exit(0);

            }else{
            System.out.println("Escribe el final: ");
            Integer fin = sc.nextInt();
            var p = PrimoUtilities.primosIntervalo(init, fin);
                imprimir(p);


        /* forEach
        for (Integer i : p) {
            System.out.println(i);
        }
         */

        /*Lambda
        p.forEach(
        (entero) -> { System.out.println(entero); }
        );
        */


            }
        }
    }

    private static void imprimir(ArrayList<Integer> p) {
        System.out.println("Total: " + p.size());
        Iterator<Integer> it = p.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}