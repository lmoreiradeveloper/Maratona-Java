package com.leomoreiradev.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo

        byte dia = 10;

        //dentro do switch podemos ter os tipos: char, int, byte, short, enum, String

        switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opção de dia inválida");
                break;

        }

        char sexo = 'D';

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Opção sexo invalida");
                break;
        }

    }
}
