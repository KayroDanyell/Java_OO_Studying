package POO.Composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    String nome;
    Double saldo = 0.00;
    ArrayList<Compra> compras = new ArrayList<>();
    Double vlTotalCompras;

    Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String fazerCompra(Compra compra) {
        if (saldo > compra.vlTotal) {
            saldo -= compra.vlTotal;
            compras.add(compra);
        }
        String message = String.format("Sua compra foi de %f e seu saldo agora é de %f",compra.vlTotal,this.saldo);
        System.out.println(message);
        return compras.toString();
    }

    double adicionaSaldo(int valor) {
        this.saldo += valor;
        return this.saldo;
    }
}
