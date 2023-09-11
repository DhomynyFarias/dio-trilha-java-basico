import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        float saldo = 0;

        Scanner lScanner = new Scanner(System.in);
        Scanner lScanner2 = new Scanner(System.in);

        System.out.print("Por favor insira o número da conta: ");
        numero = lScanner2.nextInt();

        System.out.print("\nPor favor insira o número da sua Agência: ");
        agencia = lScanner.next();

        System.out.print("\nPor favor insira o seu nome completo: ");
        nomeCliente = lScanner.next();

        System.out.print("\nPor favor informe o seu saldo: ");
        saldo = lScanner2.nextFloat();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.",nomeCliente,agencia,numero,saldo);


        lScanner.close();
        lScanner2.close();
    }
}
