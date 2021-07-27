package br.com.zup.cadastroimobiliaria;

import java.util.ArrayList;
import java.util.List;

public class ListaDeImoveis {
    private static List<Imovel> imoveis = new ArrayList<>();

    public static void adicionarImovelNaLista(Imovel imovel){
        imoveis.add(imovel);
    }

    public static void mostrarListaDeImoveis() {
        for (Imovel imovel: imoveis) {
            imovel.exibirDadosImovel();
        }
    }
}
