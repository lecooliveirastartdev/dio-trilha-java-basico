import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu número de Usuário:");
        int numeroUsuario = scanner.nextInt();

        System.out.println("Por favor, digite o numero da Agência!");
        String numeroTextoAgencia = scanner.next();

        System.out.println("Por favor, digite o  seu Nome!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o  seu Sobrenome!");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o valor do deposito inicial:");
        double depositoInicial = scanner.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + " " +  sobrenomeCliente + "\n" + "Obrigado por criar uma conta em nosso banco!"

                        + "\n" + "Sua agência é " + numeroTextoAgencia + " conta " + numeroUsuario

                        + " e seu saldo de: " + depositoInicial + " já está disponível para saque.");

    }
}
