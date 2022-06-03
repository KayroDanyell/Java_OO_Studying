package POO.Composicao.desafio;

public class Programa {
    public static void main(String[] args) {
        Produto prod1 = new Produto("shampoo",12.00);
        Compra compra1 = new Compra(prod1,5);

        Cliente client1 = new Cliente("José",150.00);
        client1.fazerCompra(compra1);
    }
}
