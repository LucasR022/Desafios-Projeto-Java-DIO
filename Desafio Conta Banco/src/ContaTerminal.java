import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        numeroConta = scan.nextInt();
        System.out.println("Digite o número da agência: ");
        agencia = scan.nextLine();
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scan.nextLine();
        System.out.println("Digite o valor que irá depositar: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
