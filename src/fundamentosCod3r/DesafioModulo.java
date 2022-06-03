package fundamentosCod3r;

import java.util.Scanner;

public class DesafioModulo {
    public static void main(String[] args) {

        //ler num1
        //ler num2
        // ler opração

        int num1;
        int num2;
        String operacao;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        num1 = leitor.nextInt();
        leitor.nextLine();
        System.out.printf("numero1: %d",num1);

        System.out.println("Digite o segundo numero:");
        num2 = leitor.nextInt();
        leitor.nextLine();
        System.out.printf("numero2: %d",num2);

        System.out.println("Digite a operação q quer fazer com os numeros:");
        operacao = leitor.next();
        System.out.printf("operacao: %s",operacao);

        double result;

        result = "+".equals(operacao) ? num1+num2 :0;
        result = "-".equals(operacao) ? num1-num2 :result;
        result = "*".equals(operacao) ? num1*num2 :result;
        result = "/".equals(operacao) ? num1/num2 :result;
        result = "%".equals(operacao) ? num1%num2 :result;

        System.out.println("RESultado: "+result);
        leitor.close();
    }
}
