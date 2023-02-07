package com.leomoreiradev.javacore.Aintroducaoclasses.test;

import com.leomoreiradev.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fuca bala";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        //Carro 2 faz referencia pro msm obj de carro 1
        Carro carro2 = carro1;


        System.out.println(String.format("[Carro 1] - Nome: %s, modelo: %s, ano: %d", carro1.nome, carro1.modelo, carro1.ano));
        System.out.println(String.format("[Carro 2] - Nome: %s, modelo: %s, ano: %d", carro2.nome, carro2.modelo, carro2.ano));
    }
}
