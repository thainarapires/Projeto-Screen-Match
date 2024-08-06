package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão", 2003);
        Filme outroFilme = new Filme("Avatar", 2005);
        Filme filmeDaThai = new Filme("Filme da Thai", 2003);
        Serie lost = new Serie("Lost", 2004);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDaThai);
        filmeDaThai.avalia(9);
        outroFilme.avalia(5);
        meuFilme.avalia(7);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(lost);
        for (Titulo item: listaDeAssistidos) {
            System.out.println(item);
            if (item instanceof Filme) { //item instanceof Filme filme java14+
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois de 0rdenar: " + buscaPorArtista);

        System.out.println("Teste: " + listaDeAssistidos);
        Collections.sort(listaDeAssistidos);
        System.out.println("Dps de ordenar: " + listaDeAssistidos);

        listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Por ano de lançamento: " + listaDeAssistidos);
        List<String> nome = new ArrayList<>();
    }

}
