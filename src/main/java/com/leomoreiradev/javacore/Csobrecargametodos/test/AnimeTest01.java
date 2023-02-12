package com.leomoreiradev.javacore.Csobrecargametodos.test;

import com.leomoreiradev.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //usando sobrecarga de metodos

        //Metodo 1
        anime.init("Akudama Drive", "TV", 12);

        //Metodo 2
        anime.init("Akudama Drive", "TV", 12, "Ação");
//        anime.setNome("Akudama Drive");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        anime.imprime();
    }
}
