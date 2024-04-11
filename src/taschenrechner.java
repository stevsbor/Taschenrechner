import java.util.Scanner;

public class taschenrechner {
    public static void main(String[] args) {
//Inizialisierung des Scanners und Abfrage des Nutzers
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein:");
        double num1 = scanner.nextDouble();

        System.out.println("Geben Sie die zweite Zahl ein:");
        double num2 = scanner.nextDouble();

        System.out.println("Geben Sie einen Operator ein (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;
//Switch für die verschiedenen Operatoren
        switch(operator)
        {
            case '+':
                output = addieren(num1, num2);
                break;

            case '-':
                output = subtrahieren(num1, num2);
                break;

            case '*':
                output = multiplizieren(num1, num2);
                break;

            case '/':
                if (num2 != 0) {
                    output = dividieren(num1, num2);
                } else {
                    System.out.println("Fehler! Division durch Null ist nicht erlaubt.");
                    return;
                }
                break;

            default:
                System.out.println("Sie haben einen falschen Operator eingegeben");
                return;
        }
//Output
        System.out.println("Das Ergebnis ist: "+output);
    }
//Methoden für die jeweiligen Operatoren
	public static double dividieren(double num1, double num2) {
		double temp = num1 / num2;
		return temp;
	}

	public static double multiplizieren(double num1, double num2) {
		double temp = num1 * num2;
		return temp;
	}

	public static double subtrahieren(double num1, double num2) {
		double temp = num1 - num2;
		return temp;
	}

	public static double addieren(double num1, double num2) {
		double temp = num1 + num2;
		return temp;
	}
}
