package com.leomoreiradev.introducao;

/*
Pratica

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguin mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salario  de <salario>, na data <data>
* */

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Pedro";
        String endereco = "Rua 02 - Vila Franca - SP";
        double salario = 2000.00;
        String data = "01/01/2022";
        String texto = "Eu " + nome + ", morando no endereço " + endereco + ",\n" +
                "confirmo que recebi o salario  de " + salario + ", na data " + data;
        System.out.println(texto);
    }

}
