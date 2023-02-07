package com.leomoreiradev.introducao;

import java.util.Arrays;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        //Imprimindo um array inteiro.
        System.out.println("Imprimindo array inteiro:" + Arrays.toString(idades));

        //Imprimindo pela posição
        System.out.println("Imprimindo valor na posição idades[0]:" + idades[0]);


    }
}
