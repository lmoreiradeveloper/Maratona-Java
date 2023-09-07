package com.leomoreiradev.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    //0 Bloco de inicialização é executado quandoa JVM carregar a classe
    //1 alocado espaçõ em memoria
    //2 cada atributo de classe é  inicializado com valores default ou o que for passado
    //3 bloco de inicialização é  executado -------------- ignorar
    //4 construtor é executado

    //bloco de inicialização static, ele inicia antes do construtor e inicia apenas uma vez
    static {

        System.out.println("Dentro do bloco de inicialização estatico");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }

    }

    {
        System.out.println("Bloco de inicialização não estatico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for (int episodio: Anime.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public String getNome(){
        return nome;
    }

    public int[] getEpisodios(){
        return episodios;
    }
}
