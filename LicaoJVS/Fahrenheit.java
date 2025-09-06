import java.util.Scanner;

public class Fahrenheit{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a temperatura em Fahrenheit
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Calcula a temperatura em Celsius
        double celsius = 5.0 * (fahrenheit - 32.0) / 9.0;

        // Exibe o resultado
        System.out.println(fahrenheit + "°F equivalem a " + celsius + "°C");

        scanner.close();
    }
}