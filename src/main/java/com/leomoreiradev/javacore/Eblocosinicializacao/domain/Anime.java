package com.leomoreiradev.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    //1 alocado espaçõ em memoria
    //2 cada atributo de classe é  inicializado com valores default ou o que for passado
    //3 bloco de inicialização é  executado
    //4 construtor é executado

    {
        //bloco de inicialização, ele inicia antes do construtor
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for (int episodio: this.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public Anime() {

    }
}
