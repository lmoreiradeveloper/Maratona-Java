package com.leomoreiradev.introducao;

import java.util.Arrays;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //Padres de iniciazação para byte, short, int, long, float e double é 0
        //char '\u0000' igual  a ''
        //boolean false
        //String null
        System.out.println("----Array na posição 0 de int----");
        int[] idades = new int[3];
        idades[0] = 15;
        idades[1] = 18;
        System.out.println(idades[0]);
        System.out.println("----Array completo----");
        System.out.println(Arrays.toString(idades));

        System.out.println("----Array na posição 0 de char----");
        char[] sexo = new char[2];
        sexo[0] = 'M';
        sexo[1] = 'F';
        System.out.println(sexo[0]);
        System.out.println("----Array completo----");
        System.out.println(Arrays.toString(sexo));

        System.out.println("----Array na posição 0 de String----");
        String[] nomes = new String[2];
        nomes[0] = "Maria";
        nomes[1] = "Flavio";
        System.out.println(nomes[0]);
        System.out.println("----Array completo----");
        System.out.println(Arrays.toString(nomes));

        //Iterando sobre o array de strings
        System.out.println("----Iterando sobre o array de strings----");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i]);
        }


    }
}
