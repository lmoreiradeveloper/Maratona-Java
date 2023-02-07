package com.leomoreiradev.introducao;

public class Aula08ArryasMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[0][0] = 1;
        arrayInt[0][1] = 2;
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];
        for (int[] arrayBase : arrayInt){
            System.out.println("\n----------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
