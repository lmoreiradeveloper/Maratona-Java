package com.leomoreiradev.javacore.Bintroducaometodos.test;

import com.leomoreiradev.javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraia");
        pessoa.setIdade(70);
        pessoa.imprime();

        System.out.println("Imprimindo nome usando o get:" + pessoa.getNome());

    }
}
