import produtos.Produto;
public class Pedido {
    private double percentualDesconto;
    private ItempPedido[] itens;

    public Pedido(double percentualDesconto, ItempPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal(){
        double somaTotal = 0;
        for (ItemPedido item : getItens()){
            somaTotal = somaTotal + item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        return somaTotal * (1 - getPercentualDesconto()/100);
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public ItempPedido[] getItens() {
        return itens;
    }

    
}
