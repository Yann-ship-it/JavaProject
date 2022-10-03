package com.koko;

public class Variables {

    public static void main(String[] args) {

        // Exercice classique pour l'âge
        int monAge = 18; // La variable doit être changé par un int sinon elle n'acceptera pas le changement de la variable
        String message = "Mon âge est de "; // La variable String permet de mettre une serie de mot à l'intérieur
        monAge = monAge + 12; // Je prends la variable monAge par default qui est 18 et je lui rajoute 12 à ma variable
        System.out.println(message + monAge);

        // Utilisation d'une variable pour calculer les autres variables
        byte calc1 = 86;
        byte calc2 = 56;
        byte calc3 = 50;
        int mass = calc1 + calc2 + calc3;
        System.out.print("final" + " : " + mass);
    }
}
