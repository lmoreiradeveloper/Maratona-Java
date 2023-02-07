package com.leomoreiradev.introducao;

public class Aula08ArryasMultidimensionais01 {
    public static void main(String[] args) {
        //1,2,3,4,5 Meses
        //31,28,31,30 dias

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("Valor do array na posição "+ i +":" + dias[i] + " -" +
                        " Valor do array dentro do primeiro array na posição " + j +":" + dias[i][j] );
            }
        }

        System.out.println("-----------USANDO FOREACH------------");

        for (int[] arrBase : dias) {
            for(int numero : arrBase) {
                System.out.println("Numero:" + numero + " dentro da array base:" + arrBase );
            }
        }


        System.out.println("Imprimindo endereço de memoria do array na posição 0:" + dias[0]);
        System.out.println("Imprimindo valor do array do dentro do 1º array na posição 0:" + dias[0][0]);

    }
}
