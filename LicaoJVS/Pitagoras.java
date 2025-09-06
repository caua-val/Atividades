import java.util.Scanner;

public class Pitagoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos catetos
        System.out.println("Digite o valor do cateto a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor do cateto b: ");
        double b = scanner.nextDouble();

        // Cálculo da hipotenusa
        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Saída do resultado
        System.out.println("A hipotenusa dos catetos " + a +" e "+ b +" é igual a "+ hipotenusa);

        scanner.close();
    }
}