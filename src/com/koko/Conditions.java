package com.koko;

public class Conditions {

    public static void main(String[] args) {

    // Conditions
    int money = 1000;
        if(money >= 5000) {
        System.out.print(" Tu peux ");
    }  else if(money <= 2000) {
        System.out.print(" Tu ne peux vraiment pas ");
    } else {
        System.out.print(" C'est mort ");
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
