package com.leomoreiradev.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for

        int count1 = 100;

        while (count1 < 10){
            System.out.println(count1);
            count1++;
        }

        //*****************************//

        int count2 = 0;

        do {
            System.out.println("Dentro do do-while: Valor do contador atual -  " + count2);
            count2++;
        } while (count2 < 10);

        //*****************************//

        for (int i=0 ; i<10; i++) {
            System.out.println("Usando for: " + i);
        }
    }
}
