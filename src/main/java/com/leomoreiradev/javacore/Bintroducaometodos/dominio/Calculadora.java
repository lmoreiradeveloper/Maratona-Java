package com.leomoreiradev.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2){

        return num1 / num2;
    }


    //Podemos usar o return (return puro) para sair do metodo mesmo sendo void
    public void divideDoisNumeros02(double num1, double num2){
        if(num2 == 0) {
            System.out.println("Não existe divisão por ZERO");
            return;
        }

        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1:" + num1);
        System.out.println("Num2:" + num2);

    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }


    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println("----Com Varargs----");
        System.out.println(soma);
    }

    //Neste caso o varargs tem que ser o ultimo parametro
    public void somaVarArgs2(double valor, int... numeros){
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println("----Metodo com 2 parametros um double e o varargs----");
        System.out.println(soma);
    }
}


