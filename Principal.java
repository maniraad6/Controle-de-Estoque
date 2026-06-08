import model.Produto;
import model.ProdutoNaoPerecivel;
import model.ProdutoPerecivel;
import service.Estoque;

public class Principal {

    public static void main(String[] args) {

        Estoque estoque = new Estoque();

        Produto arroz =
                new ProdutoNaoPerecivel(
                        "Arroz",
                        25.90,
                        50);

        Produto leite =
                new ProdutoPerecivel(
                        "Leite",
                        6.99,
                        20,
                        "10/10/2026");

        estoque.adicionarProduto(arroz);
        estoque.adicionarProduto(leite);

        estoque.listarProdutos();
    }
}