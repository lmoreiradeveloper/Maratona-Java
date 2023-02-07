package com.leomoreiradev.javacore.Bintroducaometodos.test;

import com.leomoreiradev.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20,2);
        System.out.println(resultado);

        System.out.println("---Usando o return no metodo void---");
        calculadora.divideDoisNumeros02(86,0);
    }
}
