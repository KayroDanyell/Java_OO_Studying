package POO.Composicao.desafio;

import java.util.ArrayList;

public class Compra {
    ArrayList<Item> itens;
    double vlTotal;

    Compra(Item iten){

        this.itens.add(iten);
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
}
