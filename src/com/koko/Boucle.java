package com.koko;

public class Boucle {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.println("Boucle java" + " " + i);
        }

        String pseudoss = "Zebi,La,If,Nice";
        String[] pseudos = pseudoss.split(",");
        int[] notes = {7, 9, 10, 5, 9};
        int calcul = 0;
        boolean money = true;
        int i = 0;

        for(int note : notes){
            calcul = calcul + note;
        }
        System.out.println(calcul / notes.length);
        System.out.println(notes.length);

        for(String str : pseudos) {
            System.out.println(str);
        }

        // for (;;){ // Boucle infini, (NE JAMAIS FAIRE CA)
        //    System.out.println("Boucle infini");
        // }

        do { // Boucle qui vérifie
            System.out.println("J");
        } while (!money);

        while (i != 7) { // boucle while
            i++;
            System.out.println("I" + i);
        }
    }

}
