package Exercicio01;

import java.util.ArrayList;

public class RedeSocial {
    private String nomeRedeSocial;
    private int anoCriacao;
    private String criador;
    private ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public RedeSocial(String nomeRedeSocial, int anoCriacao, String criador) {
        this.nomeRedeSocial = nomeRedeSocial;
        this.anoCriacao = anoCriacao;
        this.criador = criador;
    }

    public void inserePublicacao(Publicacao publi) {
        publicacoes.add(publi);
    }

    public void imprimePublicacoes() {
        System.out.println("Total de publicações: " + Publicacao.getContadorPublicacao());
        for (Publicacao publi : publicacoes) {
            System.out.println("Data da publicação: " + publi.getDataPublicacao());
            System.out.println("Texto da publicação: " + publi.getTextoPublicacao());
            System.out.println("Link da mídia: " + publi.getLinkMidia());
            System.out.println();
        }
    }
}
