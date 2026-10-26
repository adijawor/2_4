
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Wybierz operacje:");
    System.out.println("1 - Suma\n2 - Różnica\n3 - Iloczyn\n4 - Iloraz" );
    int wybor = scanner.nextInt();

    System.out.print("Podaj pierwszą liczbę: ");
    double a = scanner.nextDouble();

    System.out.print("Podaj drugą liczbę: ");
    double b = scanner.nextDouble();

    switch(wybor) {
      case 1:
        System.out.println("Wynik (suma): " + (a + b));
        break;
        case 2:
        System.out.println("Wynik (różnica): " + (a - b));
        break;
        case 3:
        System.out.println("Wynik (iloczyn): " + (a * b));
        break;
        case 4:
        if (b == 0){
          System.out.println("Bląd: Nie można dzielić przez 0");
          } else {
          System.out.println("Wynik (iloraz): " + (a / b));
          } 
          break;
      default:
        System.out.println("Nieprawidowy wybór operacji.");
    }
    
    scanner.close();
  }
}