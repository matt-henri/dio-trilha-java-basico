import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // int agencia = 1021;
        // String conta = "067-8";
        // String usuario = "Mario Andrade";
        // double saldo = 237.48;

        System.out.print("Por favor, digite o nome de Usuário: ");
        String usuario = sc.nextLine();

        System.out.print("Digite o número da Agência: ");
        int agencia = sc.nextInt();

        System.out.print("Digite o número da Conta: ");
        String conta = sc.next();

        System.out.print("Digite o valor do depósito: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + usuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
