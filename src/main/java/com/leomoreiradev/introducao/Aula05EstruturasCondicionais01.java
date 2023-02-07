package com.leomoreiradev.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizado = idade >= 18;
        if(isAutorizado) {
            System.out.println("Autorizado a comprar bebida alcolica.");
        } else {
            System.out.println("[Usando o else] - Não autorizado a comprar bebida alcolica.");
        }



        //Usando a negação
        if(!isAutorizado) {
            System.out.println("[Usando a negação] - Não autorizado a comprar bebida alcolica.");
        }
    }
}
