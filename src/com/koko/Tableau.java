package com.koko;

public class Tableau {

    public static void main(String[] args) {

        int[] numbers = new int[] {12, 5, 9};
        System.out.println(numbers.length);
        int mass = numbers[0] + numbers[1] + numbers[2] / numbers.length;
        System.out.println(mass);

        int[][] num = new int[][]{ // Un tableau dans un tableau
                {
                        5, 9, 10 // Premier tableau
                },
                {
                        5, 8, 7 // Deuxième tableau
                },
                {
                        9, 5, 3 // Troisième tableau
                },
        };
        System.out.println("NUM" + " " + num[0][0]); // Le premier [] défini le premier tableau et le deuxième [] défini l'élement qu'on prends

        String pseudoss = "Zebi,La,If,Nice";
        String[] pseudos = pseudoss.split(",");
        System.out.println(pseudos[0]);

    }

}
