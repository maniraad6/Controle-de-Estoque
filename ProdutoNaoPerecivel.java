package model;
public class ProdutoNaoPerecivel extends Produto {

    public ProdutoNaoPerecivel(
            String nome,
            double preco,
            int quantidade) {

        super(nome, preco, quantidade);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(
                nome +
                " | R$" + preco +
                " | Estoque: " + quantidade);
    }
}