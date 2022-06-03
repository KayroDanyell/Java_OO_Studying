package POO.Composicao.desafio;

import java.util.Objects;

public class Item {
    Produto produtos;
    int quantidade;
    double precoItem;

    Item(Produto produto,int quant){

        this.produtos = produto;
        this.quantidade = quant;
        this.precoItem = produto.preco * quant;

    }

    int addQuant(int quant){

        this.quantidade += quant;
        this.precoItem = produtos.preco * quant;
        return this.quantidade;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.precoItem, precoItem) == 0 && produtos.equals(item.produtos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produtos, precoItem);
    }
}
