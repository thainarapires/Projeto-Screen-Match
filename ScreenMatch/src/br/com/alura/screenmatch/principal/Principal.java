package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão", 2004);
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração em mins:" + meuFilme.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2003);
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(260);
        System.out.println("Duração em mins:" + outroFilme.getDuracaoEmMinutos());

        Filme filmeDaThai = new Filme("Filme da Thai", 2003);
        filmeDaThai.setAnoDeLancamento(2003);
        filmeDaThai.setDuracaoEmMinutos(200);
        filmeDaThai.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaThai);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome() + "\n");
        System.out.println(listaDeFilmes);

        meuFilme.exibeFichaTecnicaFilme();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(4);
        System.out.println("Total de avaliaçãoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaDasAvaliacoes());

        Serie lost = new Serie("Lost", 2004);
        lost.exibeFichaTecnicaSerie();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutorPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(200);
        filtro.filtra(episodio);

    }
}
