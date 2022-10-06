package com.koko;

public class Conditions {

    public static void main(String[] args) {

    // Conditions
    int money = 1000; // J'initialise ma variable money à 1000
        if(money >= 5000) { // Si la money est supérieur ou égale à 5000 donc
        System.out.print(" Tu peux "); //
    }  else if(money == 2000) { // Sinon si ma variable money est égale à 2000
        System.out.print(" Tu ne peux vraiment pas "); //
    } else { // Sinon
        System.out.print(" C'est mort "); //
    }

    // Switch
    int car = 1000;
        switch (car) {
            case 1000:
                System.out.print(" Tu peux ");
                break;
        }
    }
}
