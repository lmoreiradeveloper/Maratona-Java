package com.leomoreiradev.introducao;

import java.util.Arrays;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //Uma forma de inicializar um array
        int[] numeros = { 1, 2, 3 };

        //OU

        //Uma outra forma de inicializar um array
        int[] numeros2 = new int[]{ 1, 2, 3 };

        System.out.println(Arrays.toString(numeros));

        //usando foreach para percorrer o array

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
