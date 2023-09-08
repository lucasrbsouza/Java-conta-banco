import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String agencia= "067-8";
        double saldo= 237.48;
        Scanner tec= new Scanner(System.in);
        System.out.println("Por favor, Digite seu nome: ");
        String nomeCliente= tec.next();
        System.out.println("Por favor, digite o número da Agência: ");
        int numeroAgencia= tec.nextInt();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %2.3f já está disponível para saque", nomeCliente, agencia, numeroAgencia, saldo);

    }
}
