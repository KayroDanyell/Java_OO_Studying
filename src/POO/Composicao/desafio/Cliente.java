package POO.Composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    String nome;
    double saldo = 0;
    ArrayList<Compra> compras;
    double vlTotalCompras;

    Cliente(String nome,double saldo){
            this.nome = nome;
            this.saldo = saldo;
    }

    String fazerCompra(Compra compra){
        if(saldo>compra.vlTotal){
            saldo -= compra.vlTotal;
            compras.add(compra);
        }
        return compras.toString();
    }

    double adicionaSaldo(int valor){
        this.saldo += valor;
        return this.saldo;
    }
}
