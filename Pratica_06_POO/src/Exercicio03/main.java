package Exercicio03;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        // Criando uma lista de artigos
        ArrayList<Artigo> artigos = new ArrayList<Artigo>();

        // Criando 10 objetos da classe Artigo e adicionando na lista
        Artigo artigo1 = new Artigo("Título do Artigo 1", "Autor 1", "Resumo do Artigo 1");
        Artigo artigo2 = new Artigo("Título do Artigo 2", "Autor 2", "Resumo do Artigo 2");
        Artigo artigo3 = new Artigo("Título do Artigo 3", "Autor 3", "Resumo do Artigo 3");
        Artigo artigo4 = new Artigo("Título do Artigo 4", "Autor 4", "Resumo do Artigo 4");
        Artigo artigo5 = new Artigo("Título do Artigo 5", "Autor 5", "Resumo do Artigo 5");
        Artigo artigo6 = new Artigo("Título do Artigo 6", "Autor 6", "Resumo do Artigo 6");
        Artigo artigo7 = new Artigo("Título do Artigo 7", "Autor 7", "Resumo do Artigo 7");
        Artigo artigo8 = new Artigo("Título do Artigo 8", "Autor 8", "Resumo do Artigo 8");
        Artigo artigo9 = new Artigo("Título do Artigo 9", "Autor 9", "Resumo do Artigo 9");
        Artigo artigo10 = new Artigo("Título do Artigo 10", "Autor 10", "Resumo do Artigo 10");

        artigos.add(artigo1);
        artigos.add(artigo2);
        artigos.add(artigo3);
        artigos.add(artigo4);
        artigos.add(artigo5);
        artigos.add(artigo6);
        artigos.add(artigo7);
        artigos.add(artigo8);
        artigos.add(artigo9);
        artigos.add(artigo10);

        // Criando um objeto do tipo Edição e adicionando os artigos
        Edicao edicao1 = new Edicao(1, 1, "01/01/2022", 1000, artigos);

        // Criando um objeto do tipo RevistaCientifica e adicionando a Edição
        RevistaCientifica revista1 = new RevistaCientifica("Revista de Tecnologia", "Editora X", "Tecnologia", 2022);
        revista1.adicionarEdicao(edicao1);

        // Imprimindo os dados da revista e da edição
        System.out.println("Dados da Revista:");
        System.out.println("Nome: " + revista1.getNome());
        System.out.println("Editora: " + revista1.getEditora());
        System.out.println("Área: " + revista1.getArea());
        System.out.println("Ano de lançamento: " + revista1.getAnoLancamento());

        System.out.println("\nDados da Edição:");
        System.out.println("Número: " + edicao1.getNumero());
        System.out.println("Volume: " + edicao1.getVolume());
        System.out.println("Data de edição: " + edicao1.getDataEdicao());
    }
}

