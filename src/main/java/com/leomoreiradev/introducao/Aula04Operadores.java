package com.leomoreiradev.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //Operadores aritimeticos ( + - / *)
        int numero01 = 10;
        int numero02 = 20;

        double resultado = numero01 / numero02;

        System.out.println(numero02 - numero01);
        System.out.println("Valor:" + resultado);

        // modulo %
        int resto = 20 % 2;
        System.out.println("Resto:" + resto);

        // Operadores Relacionais ( < , > , <=, >=, ==, !=)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezIDiferenteDeDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte: " + isDezIgualAVinte);
        System.out.println("isDezIgualADez: " + isDezIgualADez);
        System.out.println("isDezIDiferenteDeDez: " + isDezIDiferenteDeDez);

        // Operadores logicos (AND &&, OR ||, NOT !  )
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Resultado isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Resultado isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel: " + isPlayStationCincoCompravel );

        //Operador de atribuicao (==, +=, -=, *=, /=, %=)

        double bonus = 1800;
        //bonus += 1000;
        //bonus -= 1000;
        //bonus *= 2;
        //bonus /= 2;
        bonus %= 2;

        System.out.println("Valor total:" + bonus);

        //Operadores unarios (variavel++, variavel--, ++variavel, --variavel)

        int contatodor = 0;
        System.out.println("Resultado antes do incremento: " + contatodor);
        contatodor++;
        System.out.println("Resultado depois do incremento: " + contatodor);

        int contatodor2 = 0;
        System.out.println(++contatodor2);







    }
}
