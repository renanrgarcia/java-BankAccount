import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Enter your name: ");
    String clientName = scanner.nextLine();
    System.out.println("Enter your agency number: ");
    String agency = scanner.next();
    System.out.println("Enter your account number: ");
    int account = scanner.nextInt();
    System.out.println("Enter your account balance: ");
    Double balance = scanner.nextDouble();

    System.out.println("Hello " + clientName + ", thank you for creating an Account in our bank.");
    System.out.println("Your agency is " + agency + ", account " + account + " and balance of $ " + balance + ".");
  }
}