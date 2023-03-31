import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando as variáveis para a conta banco
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        // Criando o Scanner
        Scanner entrada = new Scanner(System.in);

        // Utilizando o Scanner para ler as informações
        System.out.print("Olá, Seja bem-vindo! Por favor digite seu nome : ");
        nomeCliente = entrada.next();

        System.out.print(nomeCliente + ", digite o número da sua agência, por favor: ");
        agencia = entrada.next();

        System.out.print("Perfeito, agora digite o número da sua conta, por favor: ");
        numero = entrada.nextInt();

        System.out.print("Obrigado, " + nomeCliente + ", agora digite o valor que quer como primeiro depósito: ");
        saldo = entrada.nextFloat();

        System.out.println();

        // Saida final do programa
        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}