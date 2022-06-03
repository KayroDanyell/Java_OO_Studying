package POO.Composicao.desafio;

import java.util.ArrayList;
import java.util.Objects;

public class Compra {
    ArrayList<Item> itens = new ArrayList<>();
    Double vlTotal = 0.00;

    Compra(Produto produto,int quant){
        Item iten = new Item(produto,quant);

        this.adicionaItem(iten);
    }

    boolean adicionaItem(Item newIten){
        itens.add(newIten);
        vlTotal += newIten.precoItem;

        return itens.contains(newIten);
    }

    double getVlTotal(){
        double newPrecoTotal = 0;
        for (Item iten:itens) {
            newPrecoTotal += iten.precoItem;

        }
        this.vlTotal = newPrecoTotal;
        return newPrecoTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Compra)) return false;
        Compra compra = (Compra) o;
        return Double.compare(compra.vlTotal, vlTotal) == 0 && itens.equals(compra.itens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itens, vlTotal);
    }
}
