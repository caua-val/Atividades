import java.util.Scanner;

public class Polegadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor em centímetros
        System.out.print("Digite o comprimento em centímetros: ");
        double centimetros = scanner.nextDouble();

        // Conversão para polegadas
        double polegadas = centimetros / 2.54;

        // Saída do resultado
        System.out.println(centimetros + " equivalem a " + polegadas);

        scanner.close();
    }
}
