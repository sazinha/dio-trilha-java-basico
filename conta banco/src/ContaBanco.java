import java.util.Locale;
import java.util.Scanner;



public class ContaBanco {
    public static void main(String[] args) {
     Scanner scanner= new Scanner(System.in).useLocale(Locale.US);  
    
    System.out.println("Digite o seu nome: ");
    String nome= scanner.next();

     System.out.println("Digite o numero da agencia: ");
    String agencia= scanner.next();

    System.out.println("Digite o numero da sua conta: ");
    int conta= scanner.nextInt();

    System.out.println("Digite o seu saldo: ");
    double saldo= scanner.nextDouble();

    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!");
    }
}
    
    