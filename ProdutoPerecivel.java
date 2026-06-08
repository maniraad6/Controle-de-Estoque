package model;
public class ProdutoPerecivel extends Produto {

    private String validade;

    public ProdutoPerecivel(
            String nome,
            double preco,
            int quantidade,
            String validade) {

        super(nome, preco, quantidade);
        this.validade = validade;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(
                nome +
                " | R$" + preco +
                " | Estoque: " + quantidade +
                " | Validade: " + validade);
    }
}
