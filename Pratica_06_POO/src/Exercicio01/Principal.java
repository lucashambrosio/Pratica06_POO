package Exercicio01;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        // Criação de uma rede social
        String nomeRedeSocial = JOptionPane.showInputDialog("Digite o nome da rede social:");
        int anoCriacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de criação da rede social:"));
        String criador = JOptionPane.showInputDialog("Digite o nome do criador da rede social:");
        RedeSocial redeSocial = new RedeSocial(nomeRedeSocial, anoCriacao, criador);

        // Criação de publicações
        String dataPubli1 = JOptionPane.showInputDialog("Digite a data da primeira publicação:");
        String textoPubli1 = JOptionPane.showInputDialog("Digite o texto da primeira publicação:");
        String linkMidiaPubli1 = JOptionPane.showInputDialog("Digite o link da mídia da primeira publicação:");
        Publicacao publi1 = new Publicacao(dataPubli1, textoPubli1, linkMidiaPubli1);

        String dataPubli2 = JOptionPane.showInputDialog("Digite a data da segunda publicação:");
        String textoPubli2 = JOptionPane.showInputDialog("Digite o texto da primeira publicação:");
        String linkMidiaPubli2 = JOptionPane.showInputDialog("Digite o link da mídia da primeira publicação:");
        Publicacao publi2 = new Publicacao(dataPubli1, textoPubli1, linkMidiaPubli1);

        // Inserção das publicações na rede social
        redeSocial.inserePublicacao(publi1);
        redeSocial.inserePublicacao(publi2);

        // Impressão das publicações
        redeSocial.imprimePublicacoes();
    }
}

