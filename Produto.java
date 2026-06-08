package model;
public abstract class Produto {

    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public abstract void exibirDetalhes();

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarEstoque(int qtd) {
        quantidade += qtd;
    }

    public void removerEstoque(int qtd) {
        quantidade -= qtd;
    }
}