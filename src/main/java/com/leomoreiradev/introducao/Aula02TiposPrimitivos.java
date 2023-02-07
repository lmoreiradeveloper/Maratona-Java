package com.leomoreiradev.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long , boolean

        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500.65F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caracterA = 'A';
        char caracter = 87;
        char caracterUnicode = '\u0041';
        System.out.println("int: " + idade);
        System.out.println("caractereA: " + caracterA);
        System.out.println("caractereUnicode: " + caracterUnicode);
        System.out.println("caracter: " + caracter);
        System.out.println("salarioFloat: " + salarioFloat);
    }
}
