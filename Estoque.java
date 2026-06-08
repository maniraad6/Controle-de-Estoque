package service;

import java.util.ArrayList;
import model.Produto;

public class Estoque {

    private ArrayList<Produto> produtos =
            new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {

        for (Produto produto : produtos) {
            produto.exibirDetalhes();
        }

    }
}